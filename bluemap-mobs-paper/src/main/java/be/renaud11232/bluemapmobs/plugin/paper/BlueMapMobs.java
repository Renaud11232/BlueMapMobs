package be.renaud11232.bluemapmobs.plugin.paper;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.plugin.module.configuration.BukkitModuleConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueMapMobs extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapMobs...");
            reloadConfig();
            api.registerModule(new PaperMobsModule(api, BukkitModuleConfiguration.deserialize(getConfig().getValues(true))));
        });
    }
}
