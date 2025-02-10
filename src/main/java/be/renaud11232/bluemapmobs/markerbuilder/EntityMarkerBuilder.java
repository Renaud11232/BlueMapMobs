package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class EntityMarkerBuilder<T extends Entity> implements MarkerBuilder<T> {

    private final FileConfiguration config;
    @SuppressWarnings("rawtypes")
    private final Map<Class<? extends T>, MarkerBuilder> markerBuilders;
    private final boolean displayed;

    public EntityMarkerBuilder(FileConfiguration config) {
        this.config = config;
        this.markerBuilders = new HashMap<>();
        displayed = isDisplayed();
    }

    @Override
    @SuppressWarnings("unchecked")
    public final Optional<POIMarker> build(T entity) {
        Block block = entity.getLocation().getBlock();
        if(block.getLightFromBlocks() < config.getInt("general.minimum_block_light", 4) && block.getLightFromSky() < config.getInt("general.minimum_sky_light", 1)) {
            return Optional.empty();
        }
        return markerBuilders.entrySet()
                .stream()
                .filter(entry -> entry.getKey().isInstance(entity))
                .map(Map.Entry::getValue)
                .findFirst()
                .map(markerBuilder -> (Optional<POIMarker>)markerBuilder.build(entity))
                .orElseGet(() -> MarkerBuilder.super.build(entity))
                .map(marker -> {
                    marker.addStyleClasses(List.of("bluemapmobs-marker"));
                    return marker;
                });
    }

    @Override
    public Optional<POIMarker> buildDefault(T entity) {
        if(displayed) {
            return MarkerBuilder.super.buildDefault(entity);
        }
        return Optional.empty();
    }

    protected <U extends T> void registerMarkerBuilder(Class<? extends U> klass, MarkerBuilder<U> builder) {
        markerBuilders.put(klass, builder);
    }

    protected boolean isDisplayed() {
        return true;
    }

    public FileConfiguration getConfig() {
        return this.config;
    }
}
