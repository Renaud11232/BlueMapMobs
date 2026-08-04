package be.renaud11232.bluemapentities.bukkit;

import be.renaud11232.bluemapentities.bukkit.configuration.BukkitConfiguration;
import be.renaud11232.bluemapentities.module.ModuleProvider;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class BukkitBlueMapEntitiesPlugin<SOURCE_ENTITY_TYPE> extends JavaPlugin implements ModuleProvider<World, SOURCE_ENTITY_TYPE> {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Enabling " + getName());
            reloadConfig();
            var configuration = BukkitConfiguration.deserialize(getConfig().getValues(true));
            var module = provideModule(api, configuration);
            getLogger().info("Scheduling update task...");
            Bukkit.getScheduler().runTaskTimer(this, module::update, 0, 200);
        });
        BlueMapAPI.onDisable(_ -> {
            getLogger().info("Cancelling scheduled tasks...");
            Bukkit.getScheduler().cancelTasks(this);
        });
    }
}
