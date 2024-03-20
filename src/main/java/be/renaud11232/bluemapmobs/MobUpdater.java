package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

import java.util.*;

public class MobUpdater implements Runnable {

    private final BlueMapAPI api;
    private final Map<World, Map<LivingEntity, Marker>> worldMarkers;

    public MobUpdater(BlueMapAPI api) {
        this.api = api;
        this.worldMarkers = new HashMap<>();
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            Set<LivingEntity> livingEntities = new HashSet<>(world.getLivingEntities());
            Map<LivingEntity, Marker> markers = worldMarkers.computeIfAbsent(world, id -> new HashMap<>());
            markers.entrySet().removeIf(entry -> !livingEntities.contains(entry.getKey()));
            livingEntities.forEach(livingEntity -> {
                Marker marker = markers.computeIfAbsent(livingEntity, id -> POIMarker.builder()
                        .label(livingEntity.getName())
                        .maxDistance(1000)
                        .build()
                );
                marker.setPosition(livingEntity.getX(), livingEntity.getY(), livingEntity.getZ());
            });
            api.getWorld(world).ifPresent(blueMapWorld -> {
                blueMapWorld.getMaps().forEach(map -> {
                    MarkerSet markerSet = map.getMarkerSets().computeIfAbsent("mobs-markers", id -> MarkerSet.builder()
                            .label("Mobs")
                            .toggleable(true)
                            .defaultHidden(false)
                            .build()
                    );
                    markerSet.getMarkers().clear();
                });
            });
        });
    }
}
