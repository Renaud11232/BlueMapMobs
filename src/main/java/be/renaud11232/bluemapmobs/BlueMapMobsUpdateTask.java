package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.updater.WorldMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.impl.WorldMobMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.impl.WorldNPCMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.impl.WorldOtherEntityMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.impl.WorldVehicleMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.util.LinkedList;
import java.util.List;

public class BlueMapMobsUpdateTask implements Runnable {
    private final FileConfiguration config;
    private final FileConfiguration defaultConfig;
    private final List<WorldMarkerUpdater> updaters;

    public BlueMapMobsUpdateTask(BlueMapMobs plugin, BlueMapAPI api) {
        config = plugin.getConfig();
        defaultConfig = plugin.getDefaultConfig();
        updaters = new LinkedList<>();
        if (isEnabled(BlueMapMobsConfiguration.MarkerSets.Mobs.ENABLED)) {
            updaters.add(new WorldMobMarkerUpdater(plugin, api));
        }
        if (isEnabled(BlueMapMobsConfiguration.MarkerSets.Vehicles.ENABLED)) {
            updaters.add(new WorldVehicleMarkerUpdater(plugin, api));
        }
        if (isEnabled(BlueMapMobsConfiguration.MarkerSets.Others.ENABLED)) {
            updaters.add(new WorldOtherEntityMarkerUpdater(plugin, api));
        }
        Plugin citizens = plugin.getServer().getPluginManager().getPlugin("Citizens");
        if (isEnabled(BlueMapMobsConfiguration.MarkerSets.NPCs.ENABLED) && citizens != null && citizens.isEnabled()) {
            updaters.add(new WorldNPCMarkerUpdater(plugin, api));
        }
    }

    private boolean isEnabled(Configuration<Boolean> configuration) {
        return configuration.get(config, defaultConfig);
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> updaters.forEach(updater -> updater.update(world)));
    }
}
