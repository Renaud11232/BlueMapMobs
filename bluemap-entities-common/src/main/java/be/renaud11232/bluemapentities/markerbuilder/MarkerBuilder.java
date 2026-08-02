package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.entity.Entity;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.Optional;

public interface MarkerBuilder<T extends Entity> {
    Optional<POIMarker> build(T entity);
}
