package be.renaud11232.bluemapentities;

import be.renaud11232.bluemapentities.io.AssetExtractor;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Consumer;

public abstract class BlueMapEntitiesAPI {
    private static BlueMapEntitiesAPI INSTANCE;
    private static final LinkedHashSet<Consumer<BlueMapEntitiesAPI>> ON_ENABLE_CONSUMERS = new LinkedHashSet<>();
    private static final LinkedHashSet<Consumer<BlueMapEntitiesAPI>> ON_DISABLE_CONSUMERS = new LinkedHashSet<>();

    private final BlueMapAPI api;
    private final GeneralConfiguration configuration;
    private final List<Module> modules;

    protected BlueMapEntitiesAPI(BlueMapAPI api, GeneralConfiguration configuration) {
        this.api = api;
        this.configuration = configuration;
        this.modules = new LinkedList<>();
        extractAssets(getClass(), "assets", Path.of("assets").resolve("bluemap-entities"));
    }

    public BlueMapAPI getBlueMap() {
        return api;
    }

    public abstract Collection<?> getWorlds();

    public GeneralConfiguration getConfiguration() {
        return configuration;
    }

    public void registerModule(Module module) {
        extractAssets(module.getClass(), module.getModuleIdentifier(), Path.of("assets").resolve("bluemap-entities").resolve("modules").resolve(module.getAssetDirectoryName()));
        this.modules.add(module);
    }

    private void extractAssets(Class<?> clazz, String sourceDirName, Path relativeDestination) {
        Path destination = api.getWebApp().getWebRoot().resolve(relativeDestination);
        try (AssetExtractor assetExtractor = new AssetExtractor(clazz, sourceDirName, destination)) {
            assetExtractor.extract();
            assetExtractor.listDestinationFiles()
                    .stream()
                    .filter(f -> f.toString().toLowerCase().endsWith(".css"))
                    .map(relativeDestination::resolve)
                    .map(Path::toString)
                    .forEach(f -> api.getWebApp().registerStyle(f));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void update() {
        getWorlds().forEach(world -> modules.forEach(module -> module.update(world)));
    }

    public static synchronized Optional<BlueMapEntitiesAPI> getInstance() {
        return Optional.ofNullable(INSTANCE);
    }

    public static void onEnable(Consumer<BlueMapEntitiesAPI> consumer) {
        BlueMapEntitiesAPI api;
        synchronized (BlueMapEntitiesAPI.class) {
            ON_ENABLE_CONSUMERS.add(consumer);
            api = INSTANCE;
        }
        if (api != null) {
            consumer.accept(api);
        }
    }

    public synchronized static void onDisable(Consumer<BlueMapEntitiesAPI> consumer) {
        ON_DISABLE_CONSUMERS.add(consumer);
    }

    public synchronized static boolean unregisterListener(Consumer<BlueMapEntitiesAPI> consumer) {
        return ON_ENABLE_CONSUMERS.remove(consumer) | ON_DISABLE_CONSUMERS.remove(consumer);
    }

    public static boolean enable(BlueMapEntitiesAPI api) {
        List<Consumer<BlueMapEntitiesAPI>> consumers;
        synchronized (BlueMapEntitiesAPI.class) {
            if (INSTANCE != null) {
                return false;
            }
            INSTANCE = api;
            consumers = List.copyOf(ON_ENABLE_CONSUMERS);
        }
        return callConsumers(INSTANCE, consumers);
    }

    public static boolean disable(BlueMapEntitiesAPI api) {
        List<Consumer<BlueMapEntitiesAPI>> consumers;
        BlueMapEntitiesAPI instance;
        synchronized (BlueMapEntitiesAPI.class) {
            if (INSTANCE != api) {
                return false;
            }
            instance = INSTANCE;
            INSTANCE = null;
            consumers = List.copyOf(ON_DISABLE_CONSUMERS);
        }
        return callConsumers(instance, consumers);
    }

    private static boolean callConsumers(BlueMapEntitiesAPI instance, List<Consumer<BlueMapEntitiesAPI>> consumers) {
        List<RuntimeException> thrownExceptions = new LinkedList<>();
        consumers.forEach(consumer -> {
            try {
                consumer.accept(instance);
            } catch (RuntimeException e) {
                thrownExceptions.add(e);
            }
        });
        return throwAsOne(thrownExceptions);
    }

    private static boolean throwAsOne(List<RuntimeException> exceptions) {
        if (exceptions.isEmpty()) {
            return true;
        }
        RuntimeException e = exceptions.getFirst();
        for (int i = 1; i < exceptions.size(); i++) {
            e.addSuppressed(exceptions.get(i));
        }
        throw e;
    }
}
