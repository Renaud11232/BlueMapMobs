package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WorldMobUpdater implements Runnable {

    private final BlueMapAPI api;
    private final World world;
    private final List<LivingEntity> livingEntities;

    public WorldMobUpdater(BlueMapAPI api, World world, List<LivingEntity> livingEntities) {
        this.api = api;
        this.world = world;
        this.livingEntities = livingEntities;
    }

    @Override
    public void run() {
        Map<String, Marker> markers = livingEntities.stream()
                .collect(Collectors.toMap(
                        livingEntity -> livingEntity.getUniqueId().toString(),
                        livingEntity -> POIMarker.builder()
                                .label(livingEntity.getName())
                                .position(livingEntity.getX(), livingEntity.getY() + livingEntity.getEyeHeight(), livingEntity.getZ())
                                .maxDistance(1000)
                                .build()
                ));
        api.getWorld(world).ifPresent(blueMapWorld -> blueMapWorld.getMaps().forEach(map -> {
            MarkerSet markerSet = map.getMarkerSets().computeIfAbsent("mobs-markers", id -> MarkerSet.builder()
                    .label("Mobs")
                    .toggleable(true)
                    .defaultHidden(false)
                    .build()
            );
            markerSet.getMarkers().clear();
            markerSet.getMarkers().putAll(markers);
        }));
    }
}
