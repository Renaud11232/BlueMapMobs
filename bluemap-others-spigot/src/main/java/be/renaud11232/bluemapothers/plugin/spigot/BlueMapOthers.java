package be.renaud11232.bluemapothers.plugin.spigot;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.plugin.module.configuration.BukkitModuleConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueMapOthers extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapOthers...");
            reloadConfig();
            api.registerModule(new SpigotOthersModule(api, BukkitModuleConfiguration.deserialize(getConfig().getValues(true))));
        });
    }
}
