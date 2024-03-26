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
            getLogger().info("Reloading configuration file...");
            reloadConfig();
            getLogger().info("Extracting assets to web root...");
            extractAssets(api);
            getLogger().info("Scheduling update task...");
            Bukkit.getScheduler().runTaskTimer(this, new BlueMapMobsUpdateTask(this, api), 0, 200);
        });
        BlueMapAPI.onDisable(api -> {
            getLogger().info("Cancelling all tasks...");
            Bukkit.getScheduler().cancelTasks(this);
        });
    }

    private void extractAssets(BlueMapAPI api) {
        try {
            Path jarPath = Path.of(getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
            try (FileSystem jar = FileSystems.newFileSystem(jarPath)) {
                Path sourcePath = jar.getPath("assets");
                try (Stream<Path> sourceFiles = Files.walk(sourcePath)) {
                    Path destinationPath = api.getWebApp().getWebRoot().resolve("assets").resolve("bluemapmobs");
                    sourceFiles.forEach(sourceFile -> {
                        try {
                            Path destinationFile = destinationPath.resolve(sourcePath.relativize(sourceFile).toString());
                            if(!Files.exists(destinationFile)) {
                                Files.copy(sourceFile, destinationFile);
                            }
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
}
