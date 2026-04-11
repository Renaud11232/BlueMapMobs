package be.renaud11232.bluemapvehicles.plugin;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.plugin.module.configuration.BukkitModuleConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueMapVehicles extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapVehicles...");
            reloadConfig();
            api.registerModule(new BukkitVehiclesModule(api, BukkitModuleConfiguration.deserialize(getConfig().getValues(true))));
        });
    }
}
