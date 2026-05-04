package be.renaud11232.bluemapothers.paper;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.bukkit.module.configuration.BukkitModuleConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class PaperBlueMapOthers extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapEntitiesAPI.onEnable(api -> {
            getLogger().info("Enabling BlueMapOthers...");
            reloadConfig();
            api.registerModule(new PaperOthersModule(api, BukkitModuleConfiguration.deserialize(getConfig().getValues(true))));
        });
    }
}
