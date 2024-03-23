package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Entity;

import java.util.Optional;

public interface MarkerBuilder<T extends Entity> {

    default Optional<Marker> build(T entity) {
        return Optional.of(
                POIMarker.builder()
                        .label(entity.getName())
                        .position(entity.getX(), entity.getY(), entity.getZ())
                        .maxDistance(1000)
                        .icon(getAsset("unknown.png"), 24, 24)
                        .build()
        );
    }

    default String getAsset(String file) {
        return "assets/bluemapmobs/" + file;
    }

}
