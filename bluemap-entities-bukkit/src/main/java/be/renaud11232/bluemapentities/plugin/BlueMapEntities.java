package be.renaud11232.bluemapentities.plugin;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueMapEntities extends JavaPlugin {
    private BlueMapEntitiesAPI api;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapEntities API...");
            reloadConfig();
            this.api = new BukkitBlueMapEntitiesAPI(
                    api,
                    BukkitGeneralConfiguration.deserialize(getConfig().getValues(true)),
                    getLogger()
            );
            BlueMapEntitiesAPI.enable(this.api);
            getLogger().info("Scheduling update task...");
            Bukkit.getScheduler().runTaskTimer(this, this.api::update, 0, 200);
        });
        BlueMapAPI.onDisable(_ -> {
            getLogger().info("Cancelling scheduled tasks...");
            Bukkit.getScheduler().cancelTasks(this);
            getLogger().info("Disabling BlueMapEntities API...");
            BlueMapEntitiesAPI.disable(this.api);
            this.api = null;
        });
    }
}
