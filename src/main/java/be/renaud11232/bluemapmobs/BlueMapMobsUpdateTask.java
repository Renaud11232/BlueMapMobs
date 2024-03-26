package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.markerbuilder.MarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.MobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Vehicle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class BlueMapMobsUpdateTask implements Runnable {

    private final BlueMapMobs plugin;
    private final BlueMapAPI api;
    private final FileConfiguration config;
    private final MobMarkerBuilder mobMarkerBuilder;
    private final VehicleMarkerBuilder vehicleMarkerBuilder;


    public BlueMapMobsUpdateTask(BlueMapMobs plugin, BlueMapAPI api) {
        this.plugin = plugin;
        this.api = api;
        this.config = plugin.getConfig();
        this.mobMarkerBuilder = new MobMarkerBuilder(config);
        this.vehicleMarkerBuilder = new VehicleMarkerBuilder(config);
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            updateMarkersAsynchronously(
                    world,
                    w -> w.getEntitiesByClass(Mob.class),
                    mobMarkerBuilder,
                    config.getString("marker_sets.mobs.key", "bluemapmobs-mobs"),
                    () -> MarkerSet.builder()
                            .label(config.getString("marker_sets.mobs.label", "Mobs"))
                            .toggleable(config.getBoolean("marker_sets.mobs.toggleable", true))
                            .defaultHidden(config.getBoolean("marker_sets.mobs.default_hidden", true))
                            .build()
            );
            updateMarkersAsynchronously(
                    world,
                    w -> w.getEntitiesByClass(Vehicle.class),
                    vehicleMarkerBuilder,
                    config.getString("marker_sets.vehicles.key", "bluemapmobs-mobs"),
                    () -> MarkerSet.builder()
                            .label(config.getString("marker_sets.vehicles.label", "Vehicles"))
                            .toggleable(config.getBoolean("marker_sets.vehicles.toggleable", true))
                            .defaultHidden(config.getBoolean("marker_sets.vehicles.default_hidden", true))
                            .build()
            );
        });
    }

    private <T extends Entity> void updateMarkersAsynchronously(World world, Function<World, Collection<T>> entitiesGetter, MarkerBuilder<T> markerBuilder, String markerSetKey, Supplier<MarkerSet> markerSetSupplier) {
        Collection<T> entities = entitiesGetter.apply(world);
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
            Map<String, Marker> markers = new HashMap<>();
            entities.forEach(entity -> markerBuilder.build(entity).ifPresent(marker -> markers.put(entity.getUniqueId().toString(), marker)));
            api.getWorld(world).ifPresent(blueMapWorld -> blueMapWorld.getMaps().forEach(map -> {
                MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(markerSetKey, id -> markerSetSupplier.get());
                markerSet.getMarkers().clear();
                markerSet.getMarkers().putAll(markers);
            }));
        });
    }
}
