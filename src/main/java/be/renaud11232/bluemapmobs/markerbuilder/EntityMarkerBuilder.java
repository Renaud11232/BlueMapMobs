package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.MarkerTypeVisibilityConfig;
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

    //TODO: remove String constructor
    public EntityMarkerBuilder(FileConfiguration config, String displayedConfigKey) {
        this.config = config;
        this.markerBuilders = new HashMap<>();
        displayed = displayedConfigKey == null || config.getBoolean(displayedConfigKey, true);
    }

    public EntityMarkerBuilder(FileConfiguration config, MarkerTypeVisibilityConfig markerTypeVisibilityConfig) {
        this.config = config;
        this.markerBuilders = new HashMap<>();
        displayed = markerTypeVisibilityConfig == null || config.getBoolean(markerTypeVisibilityConfig.getKey(), markerTypeVisibilityConfig.getDefaultValue());
    }

    public EntityMarkerBuilder(FileConfiguration config) {
        //TODO remove non needed cast
        this(config, (MarkerTypeVisibilityConfig) null);
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

    public FileConfiguration getConfig() {
        return this.config;
    }
}
