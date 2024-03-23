package be.renaud11232.bluemapmobs.mobs;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.LivingEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobUpdater implements Runnable {

    private final BlueMapAPI api;
    private final MobMarkerBuilder mobMarkerBuilder;
    private final FileConfiguration config;

    public MobUpdater(BlueMapAPI api, FileConfiguration config) {
        this.api = api;
        this.mobMarkerBuilder = new MobMarkerBuilder();
        this.config = config;
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            List<LivingEntity> livingEntities = world.getLivingEntities();
            Bukkit.getScheduler().runTaskAsynchronously(BlueMapMobs.getInstance(), () -> {
                Map<String, Marker> markers = new HashMap<>();
                livingEntities.forEach(livingEntity -> mobMarkerBuilder.build(livingEntity).ifPresent(marker -> markers.put(livingEntity.getUniqueId().toString(), marker)));
                api.getWorld(world).ifPresent(blueMapWorld -> blueMapWorld.getMaps().forEach(map -> {
                    MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(config.getString("marker_sets.mobs.key", "bluemapmobs-mobs"), id -> MarkerSet.builder()
                            .label(config.getString("marker_sets.mobs.label", "Mobs"))
                            .toggleable(config.getBoolean("marker_sets.mobs.toggleable", true))
                            .defaultHidden(config.getBoolean("marker_sets.mobs.default_hidden", true))
                            .build()
                    );
                    markerSet.getMarkers().clear();
                    markerSet.getMarkers().putAll(markers);
                }));
            });
        });
    }
}
