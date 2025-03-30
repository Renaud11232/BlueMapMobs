package be.renaud11232.bluemapmobs.markerbuilder.v2;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.Optional;

public interface MarkerBuilder<T extends Entity> {
    default Optional<POIMarker> build(T entity) {
        return buildDefault(entity);
    }

    default Optional<POIMarker> buildDefault(T entity) {
        Location location = entity.getLocation();
        Icon icon = BlueMapMobsIcon.Common.UNKNOWN;
        return Optional.of(
                POIMarker.builder()
                        .label(entity.getName())
                        .position(location.getX(), location.getY(), location.getZ())
                        .icon(icon.getPath(), icon.getAnchor())
                        .styleClasses("bluemapmobs-marker")
                        .build()
        );
    }
}
