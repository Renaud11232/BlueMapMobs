package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.updater.WorldMarkerUpdaterBase;
import be.renaud11232.bluemapmobs.updater.impl.WorldMobMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.impl.WorldNPCMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.impl.WorldOtherMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.impl.WorldVehicleMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import java.util.LinkedList;
import java.util.List;

public class BlueMapMobsUpdateTask implements Runnable {
    private final List<WorldMarkerUpdaterBase<?>> updaters;

    public BlueMapMobsUpdateTask(BlueMapMobs plugin, BlueMapAPI api) {
        updaters = new LinkedList<>();
        updaters.add(new WorldMobMarkerUpdater(plugin, api));
        updaters.add(new WorldVehicleMarkerUpdater(plugin, api));
        updaters.add(new WorldOtherMarkerUpdater(plugin, api));
        Plugin citizens = plugin.getServer().getPluginManager().getPlugin("Citizens");
        if (citizens != null && citizens.isEnabled()) {
            updaters.add(new WorldNPCMarkerUpdater(plugin, api));
        }
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> updaters.forEach(updater -> updater.update(world)));
    }
}
