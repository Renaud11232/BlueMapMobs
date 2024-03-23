package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VehicleUpdater implements Runnable {

    private final BlueMapAPI api;
    private final VehicleMarkerBuilder vehicleMarkerBuilder;
    private final FileConfiguration config;

    public VehicleUpdater(BlueMapAPI api, FileConfiguration config) {
        this.api = api;
        this.vehicleMarkerBuilder = new VehicleMarkerBuilder();
        this.config = config;
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            Collection<Vehicle> vehicles = world.getEntitiesByClass(Vehicle.class);
            Bukkit.getScheduler().runTaskAsynchronously(BlueMapMobs.getInstance(), () -> {
                Map<String, Marker> markers = new HashMap<>();
                vehicles.forEach(vehicle -> vehicleMarkerBuilder.build(vehicle).ifPresent(marker -> markers.put(vehicle.getUniqueId().toString(), marker)));
                api.getWorld(world).ifPresent(blueMapWorld -> blueMapWorld.getMaps().forEach(map -> {
                    MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(config.getString("marker_sets.vehicles.key", "bluemapmobs-vehicles"), id -> MarkerSet.builder()
                            .label(config.getString("marker_sets.vehicles.label", "Vehicles"))
                            .toggleable(config.getBoolean("marker_sets.vehicles.toggleable", true))
                            .defaultHidden(config.getBoolean("marker_sets.vehicles.default_hidden", true))
                            .build()
                    );
                    markerSet.getMarkers().clear();
                    markerSet.getMarkers().putAll(markers);
                }));
            });
        });
    }
}
