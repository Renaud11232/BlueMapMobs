package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class EntityMarkerBuilder<T extends Entity> implements MarkerBuilder<T> {

    private final FileConfiguration config;
    @SuppressWarnings("rawtypes")
    private final Map<Class<? extends Entity>, MarkerBuilder> markerBuilders;

    public EntityMarkerBuilder(FileConfiguration config) {
        this.config = config;
        this.markerBuilders = new HashMap<>();
    }

    @Override
    @SuppressWarnings("unchecked,rawtypes")
    public final Optional<POIMarker> build(T entity) {
        Block block = entity.getLocation().getBlock();
        if(block.getLightFromBlocks() < config.getInt("general.minimum_block_light", 4) && block.getLightFromSky() < config.getInt("general.minimum_sky_light", 1)) {
            return Optional.empty();
        }
        Optional<MarkerBuilder> markerBuilder = markerBuilders.entrySet()
                .stream()
                .filter(entry -> entry.getKey().isInstance(entity))
                .map(Map.Entry::getValue)
                .findFirst();
        if(markerBuilder.isPresent()) {
            return markerBuilder.get().build(entity);
        }
        return MarkerBuilder.super.build(entity);
    }

    protected <U extends Entity> void registerMarkerBuilder(Class<? extends U> klass, MarkerBuilder<U> builder) {
        markerBuilders.put(klass, builder);
    }

    public FileConfiguration getConfig() {
        return this.config;
    }
}
