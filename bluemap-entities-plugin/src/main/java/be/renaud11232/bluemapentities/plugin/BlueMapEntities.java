package be.renaud11232.bluemapentities.plugin;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.plugin.module.configuration.BukkitMarkerConfiguration;
import be.renaud11232.bluemapentities.plugin.module.configuration.BukkitMarkerSetConfiguration;
import be.renaud11232.bluemapentities.plugin.module.configuration.BukkitModuleConfiguration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueMapEntities extends JavaPlugin {
    private BlueMapEntitiesAPI api;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            reloadConfig();
            getLogger().info("Enabling BlueMapEntities API...");
            this.api = new BukkitBlueMapEntitiesAPI(api, getConfig().getObject("general", BukkitGeneralConfiguration.class));
            BlueMapEntitiesAPI.enable(this.api);
            getLogger().info("Scheduling update task...");
            Bukkit.getScheduler().runTaskTimer(this, this.api::update, 0, 200);
        });
        BlueMapAPI.onDisable(api -> {
            getLogger().info("Cancelling scheduled tasks...");
            Bukkit.getScheduler().cancelTasks(this);
            getLogger().info("Disabling BlueMapEntities API...");
            BlueMapEntitiesAPI.disable(this.api);
            this.api = null;
        });
    }

    static {
        ConfigurationSerialization.registerClass(BukkitGeneralConfiguration.class, "GeneralConfiguration");
        ConfigurationSerialization.registerClass(BukkitMarkerConfiguration.class, "MarkerConfiguration");
        ConfigurationSerialization.registerClass(BukkitMarkerSetConfiguration.class, "MarkerSetConfiguration");
        ConfigurationSerialization.registerClass(BukkitModuleConfiguration.class, "ModuleConfiguration");
    }
}
