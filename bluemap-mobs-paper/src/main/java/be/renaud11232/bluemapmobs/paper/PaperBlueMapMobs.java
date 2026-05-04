package be.renaud11232.bluemapmobs.paper;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.bukkit.module.configuration.BukkitModuleConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class PaperBlueMapMobs extends JavaPlugin {
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
