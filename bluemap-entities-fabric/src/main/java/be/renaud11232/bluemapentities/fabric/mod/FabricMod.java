package be.renaud11232.bluemapentities.fabric.mod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public abstract class FabricMod<T> implements ModInitializer {
    private final Class<T> configClass;
    private final Gson gson;
    private final FabricModDefinition modDefinition;
    private final Logger logger;
    private T config;

    protected FabricMod(Class<T> configClass) {
        this.configClass = Objects.requireNonNull(configClass);
        gson = new GsonBuilder().setPrettyPrinting().create();
        try (Reader reader = new InputStreamReader(getJarResource("/fabric.mod.json"))) {
            modDefinition = gson.fromJson(reader, FabricModDefinition.class);
            logger = LoggerFactory.getLogger(getId());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected String getId() {
        return modDefinition.getId();
    }

    protected Logger getLogger() {
        return logger;
    }

    protected Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir().resolve(getId());
    }

    protected Path getConfigPath() {
        return getConfigDirectory().resolve("config.json");
    }

    protected T getConfig() {
        return config;
    }

    protected void saveDefaultConfig() {
        Path configPath = getConfigPath();
        if (!Files.exists(configPath)) {
            Path configDirectory = configPath.getParent();
            try {
                if (!Files.exists(configDirectory)) {
                    Files.createDirectories(configDirectory);
                }
                Files.copy(getJarResource("/config.json"), configPath);
            } catch (IOException e) {
                logger.error("Unable to save default configuration file.", e);
            }
        }
    }

    protected void reloadConfig() {
        try (Reader reader = Files.newBufferedReader(getConfigPath())) {
            config = gson.fromJson(reader, configClass);
        } catch (IOException e) {
            getLogger().error("Failed to reload config", e);
        }
    }

    protected InputStream getJarResource(String name) {
        try (var jar = FileSystems.newFileSystem(Path.of(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()))) {
            var source = jar.getPath(name);
            byte[] data = Files.readAllBytes(source);
            return new ByteArrayInputStream(data);
        } catch (IOException | URISyntaxException e) {
            return null;
        }
    }
}
