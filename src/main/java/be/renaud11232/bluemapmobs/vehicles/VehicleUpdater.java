package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Vehicle;

import java.util.Collection;

public class VehicleUpdater implements Runnable {

    private final BlueMapAPI api;

    public VehicleUpdater(BlueMapAPI api) {
        this.api = api;
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            Collection<Vehicle> vehicles = world.getEntitiesByClass(Vehicle.class);
            Bukkit.getScheduler().runTaskAsynchronously(BlueMapMobs.getInstance(), () -> {

            });
        });
    }
}
