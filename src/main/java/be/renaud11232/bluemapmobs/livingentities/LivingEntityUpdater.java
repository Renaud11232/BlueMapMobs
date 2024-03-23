package be.renaud11232.bluemapmobs.livingentities;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivingEntityUpdater implements Runnable {

    private final BlueMapAPI api;
    private final LivingEntityMarkerBuilder livingEntityMarkerBuilder;

    public LivingEntityUpdater(BlueMapAPI api) {
        this.api = api;
        this.livingEntityMarkerBuilder = new LivingEntityMarkerBuilder();
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            List<LivingEntity> livingEntities = world.getLivingEntities();
            Bukkit.getScheduler().runTaskAsynchronously(BlueMapMobs.getInstance(), () -> {
                Map<String, Marker> markers = new HashMap<>();
                livingEntities.forEach(livingEntity -> livingEntityMarkerBuilder.build(livingEntity).ifPresent(marker -> markers.put(livingEntity.getUniqueId().toString(), marker)));
                api.getWorld(world).ifPresent(blueMapWorld -> blueMapWorld.getMaps().forEach(map -> {
                    MarkerSet markerSet = map.getMarkerSets().computeIfAbsent("mob-markers", id -> MarkerSet.builder()
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
