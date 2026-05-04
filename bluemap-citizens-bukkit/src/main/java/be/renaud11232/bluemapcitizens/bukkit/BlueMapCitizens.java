package be.renaud11232.bluemapcitizens.bukkit;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.bukkit.module.configuration.BukkitModuleConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueMapCitizens extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapCitizens...");
            reloadConfig();
            api.registerModule(new CitizensModule(api, BukkitModuleConfiguration.deserialize(getConfig().getValues(true))));
        });
    }
}
