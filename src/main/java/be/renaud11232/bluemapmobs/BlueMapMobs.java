package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.io.AssetExtractor;
import be.renaud11232.bluemapmobs.io.ConfigurationLoader;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.nio.file.Path;


@SuppressWarnings("unused")
public final class BlueMapMobs extends JavaPlugin {

    private FileConfiguration defaultConfig;

    @Override
    public void onEnable() {
        loadDefaultConfig();
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Reloading configuration file...");
            reloadConfig();
            getLogger().info("Preparing files in the web root...");
            prepareFiles(api);
            getLogger().info("Scheduling update task...");
            Bukkit.getScheduler().runTaskTimer(this, new BlueMapMobsUpdateTask(this, api), 0, 200);
        });
        BlueMapAPI.onDisable(api -> {
            getLogger().info("Cancelling all tasks...");
            Bukkit.getScheduler().cancelTasks(this);
        });
    }

    private void loadDefaultConfig() {
        try {
            defaultConfig = new ConfigurationLoader(getResource("config.yml")).load();
        } catch (IOException e) {
            throw new BlueMapMobsException("Unable to load default configuration.", e);
        }
    }

    public FileConfiguration getDefaultConfig() {
        return defaultConfig;
    }

    private void prepareFiles(BlueMapAPI api) {
        boolean overwrite = BlueMapMobsConfiguration.General.OVERWRITE_ASSETS.get(getConfig(), getDefaultConfig());
        Path relativeDestination = Path.of("assets").resolve("bluemapmobs");
        Path destination = api.getWebApp().getWebRoot().resolve(relativeDestination);
        try (AssetExtractor assetExtractor = new AssetExtractor("assets", destination)) {
            assetExtractor.extract(overwrite);
            assetExtractor.listDestinationFiles()
                    .stream()
                    .filter(f -> f.toString().toLowerCase().endsWith(".css"))
                    .map(relativeDestination::resolve)
                    .map(Path::toString)
                    .forEach(f -> api.getWebApp().registerStyle(f));
        } catch (IOException e) {
            throw new BlueMapMobsException("An error has occurred when preparing files.", e);
        }
    }
}
