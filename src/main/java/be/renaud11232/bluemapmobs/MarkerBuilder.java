package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Entity;

import java.util.Optional;

public interface MarkerBuilder<T extends Entity> {

    default Optional<POIMarker> build(T entity) {
        return buildDefault(entity);
    }

    default Optional<POIMarker> buildDefault(T entity) {
        return Optional.of(
                POIMarker.builder()
                        .label(entity.getName())
                        .position(entity.getX(), entity.getY(), entity.getZ())
                        .maxDistance(1000)
                        .icon(Icon.UNKNOWN.getPath(), Icon.UNKNOWN.getAnchor())
                        .build()
        );
    }

}
