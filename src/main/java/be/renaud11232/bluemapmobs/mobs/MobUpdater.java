package be.renaud11232.bluemapmobs.mobs;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MobUpdater implements Runnable {

    private final BlueMapAPI api;

    public MobUpdater(BlueMapAPI api) {
        this.api = api;
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            List<LivingEntity> livingEntities = world.getLivingEntities();
            Bukkit.getScheduler().runTaskAsynchronously(BlueMapMobs.getInstance(), () -> {
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
            });
        });
    }
}
