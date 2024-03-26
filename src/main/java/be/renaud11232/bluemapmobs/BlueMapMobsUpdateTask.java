package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.updater.WorldMobMarkerUpdater;
import be.renaud11232.bluemapmobs.updater.WorldVehicleMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;

public class BlueMapMobsUpdateTask implements Runnable {
    private final WorldMobMarkerUpdater mobMarkerUpdater;
    private final WorldVehicleMarkerUpdater vehicleMarkerUpdater;


    public BlueMapMobsUpdateTask(BlueMapMobs plugin, BlueMapAPI api) {
        this.mobMarkerUpdater = new WorldMobMarkerUpdater(plugin, api);
        this.vehicleMarkerUpdater = new WorldVehicleMarkerUpdater(plugin, api);
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            mobMarkerUpdater.update(world);
            vehicleMarkerUpdater.update(world);
        });
    }
}
