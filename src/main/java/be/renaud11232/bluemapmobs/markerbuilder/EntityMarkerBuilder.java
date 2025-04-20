package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.icon.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

import java.util.Optional;

public abstract class EntityMarkerBuilder<T extends Entity> extends MarkerBuilderBase<T> {
    public EntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> buildDefault(T entity) {
        Location location = entity.getLocation();
        Icon icon = BlueMapMobsIcon.UNKNOWN;
        return Optional.of(
                POIMarker.builder()
                        .label(entity.getName())
                        .position(location.getX(), location.getY(), location.getZ())
                        .icon(icon.getPath(), icon.getAnchor())
                        .styleClasses(BlueMapMobsStyleClass.MARKER)
                        .build()
        );
    }

    @Override
    public Block getBlock(T entity) {
        return entity.getLocation().getBlock();
    }
}
