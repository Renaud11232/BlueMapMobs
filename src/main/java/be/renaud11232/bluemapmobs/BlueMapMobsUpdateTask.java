package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.updater.WorldEntityMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.WorldMobMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.WorldOtherMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.WorldVehicleMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;

import java.util.LinkedList;
import java.util.List;

public class BlueMapMobsUpdateTask implements Runnable {
    private final List<WorldEntityMarkerUpdater<?>> updaters;

    public BlueMapMobsUpdateTask(BlueMapMobs plugin, BlueMapAPI api) {
        this.updaters = new LinkedList<>();
        this.updaters.add(new WorldMobMarkerUpdater(plugin, api));
        this.updaters.add(new WorldVehicleMarkerUpdater(plugin, api));
        this.updaters.add(new WorldOtherMarkerUpdater(plugin, api));
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> updaters.forEach(updater -> updater.update(world)));
    }
}
