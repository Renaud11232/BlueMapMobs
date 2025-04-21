package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

import java.util.Optional;

public abstract class AbstractEntityMarkerBuilder<T extends Entity> extends AbstractMarkerBuilder<T> {
    public AbstractEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(T entity) {
        return super.build(entity).map(marker -> {
            marker.setLabel(entity.getName());
            Location location = entity.getLocation();
            marker.setPosition(location.getX(), location.getY(), location.getZ());
            return marker;
        });
    }

    @Override
    public Block getBlock(T entity) {
        return entity.getLocation().getBlock();
    }
}
