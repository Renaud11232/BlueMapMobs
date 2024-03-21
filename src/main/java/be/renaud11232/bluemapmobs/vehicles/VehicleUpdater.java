package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.Bukkit;
import org.bukkit.entity.Vehicle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VehicleUpdater implements Runnable {

    private final BlueMapAPI api;
    private final VehicleMarkerBuilder vehicleMarkerBuilder;

    public VehicleUpdater(BlueMapAPI api) {
        this.api = api;
        this.vehicleMarkerBuilder = new VehicleMarkerBuilder();
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            Collection<Vehicle> vehicles = world.getEntitiesByClass(Vehicle.class);
            Bukkit.getScheduler().runTaskAsynchronously(BlueMapMobs.getInstance(), () -> {
                Map<String, Marker> markers = new HashMap<>();
                vehicles.forEach(vehicle -> vehicleMarkerBuilder.build(vehicle).ifPresent(marker -> markers.put(vehicle.getUniqueId().toString(), marker)));
                api.getWorld(world).ifPresent(blueMapWorld -> blueMapWorld.getMaps().forEach(map -> {
                    MarkerSet markerSet = map.getMarkerSets().computeIfAbsent("vehicle-markers", id -> MarkerSet.builder()
                            .label("Vehicles")
                            .toggleable(true)
                            .defaultHidden(true)
                            .build()
                    );
                    markerSet.getMarkers().clear();
                    markerSet.getMarkers().putAll(markers);
                }));
            });
        });
    }
}
