package be.renaud11232.bluemapentities.fabric.mod;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.fabric.configuration.FabricConfiguration;
import be.renaud11232.bluemapentities.module.ModuleProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.server.level.ServerLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class FabricMod<SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE extends Entity> implements ModInitializer, ModuleProvider<ServerLevel, SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE> {
    private final Gson gson;
    private final FabricModDefinition modDefinition;
    private final Logger logger;
    private Configuration config;

    protected FabricMod() {
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

    protected String getName() {
        return modDefinition.getName();
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

    protected Configuration getConfig() {
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
            config = gson.fromJson(reader, FabricConfiguration.class);
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
