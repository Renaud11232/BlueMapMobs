package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.stream.Stream;


@SuppressWarnings("unused")
public final class BlueMapMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Reloading configuration file");
            reloadConfig();
            getLogger().info("Configuration file reloaded");
            getLogger().info("Copying assets");
            extractAssets(api);
            getLogger().info("Assets copied");
            getLogger().info("Scheduling task");
            Bukkit.getScheduler().runTaskTimer(this, new BlueMapMobsUpdateTask(api, getConfig()), 0, getConfig().getInt("general.refresh_rate", 20));
            getLogger().info("Task scheduled");
        });
        BlueMapAPI.onDisable(api -> {
            getLogger().info("Cancelling tasks");
            Bukkit.getScheduler().cancelTasks(this);
            getLogger().info("Tasks cancelled");
        });
    }

    private void extractAssets(BlueMapAPI api) {
        Path destinationPath = api.getWebApp().getWebRoot().resolve("assets").resolve(getClass().getName());
        try {
            Path jarPath = Path.of(getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
            try (FileSystem jar = FileSystems.newFileSystem(jarPath)) {
                Path sourcePath = jar.getPath("assets");
                try (Stream<Path> sourceFiles = Files.walk(sourcePath)) {
                    sourceFiles.forEach(sourceFile -> {
                        try {
                            Files.copy(sourceFile, destinationPath.resolve(sourcePath.relativize(sourceFile).toString()), StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                }
            }
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    public static BlueMapMobs getInstance() {
        return (BlueMapMobs) Bukkit.getPluginManager().getPlugin("BlueMapMobs");
    }
}
