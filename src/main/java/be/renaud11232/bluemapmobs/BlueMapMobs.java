package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.mobs.MobUpdater;
import be.renaud11232.bluemapmobs.vehicles.VehicleUpdater;
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
            getLogger().info("Scheduling tasks");
            Bukkit.getScheduler().runTaskTimer(this, new MobUpdater(api, getConfig()), 0, 40);
            Bukkit.getScheduler().runTaskTimer(this, new VehicleUpdater(api, getConfig()), 0, 40);
            getLogger().info("Tasks scheduled");
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
