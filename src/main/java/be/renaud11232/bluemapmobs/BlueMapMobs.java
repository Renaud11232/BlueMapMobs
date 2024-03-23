package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class BlueMapMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Reloading configuration file");
            reloadConfig();
            getLogger().info("Configuration file reloaded");
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

    public static BlueMapMobs getInstance() {
        return (BlueMapMobs) Bukkit.getPluginManager().getPlugin("BlueMapMobs");
    }
}
