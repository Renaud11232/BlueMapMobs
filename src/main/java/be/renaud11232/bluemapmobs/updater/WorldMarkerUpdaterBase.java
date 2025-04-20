package be.renaud11232.bluemapmobs.updater;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.MarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.MarkerSetBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.Bukkit;
import org.bukkit.World;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class WorldMarkerUpdaterBase<T> implements WorldMarkerUpdater {

    private final BlueMapMobs plugin;
    private final BlueMapAPI api;
    private final MarkerSetBuilder<T> markerSetBuilder;
    private final MarkerBuilder<T> markerBuilder;

    protected WorldMarkerUpdaterBase(BlueMapMobs plugin, BlueMapAPI api, MarkerSetBuilder<T> markerSetBuilder, MarkerBuilder<T> markerBuilder) {
        this.plugin = plugin;
        this.api = api;
        this.markerSetBuilder = markerSetBuilder;
        this.markerBuilder = markerBuilder;
    }

    @Override
    public void update(World world) {
        Collection<T> elements = getElements(world);
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
            Map<String, Marker> markers = new HashMap<>();
            elements.forEach(element -> markerBuilder.build(element).ifPresent(marker -> markers.put(getUniqueId(element).toString(), marker)));
            api.getWorld(world).ifPresent(blueMapWorld -> blueMapWorld.getMaps().forEach(map -> {
                MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(markerSetBuilder.getKey(), id -> markerSetBuilder.build());
                markerSet.getMarkers().clear();
                markerSet.getMarkers().putAll(markers);
            }));
        });
    }

    public abstract UUID getUniqueId(T element);

    public abstract Collection<T> getElements(World world);
}
