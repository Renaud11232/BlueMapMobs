package be.renaud11232.bluemapentitymarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.entity.Entity;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.Optional;

public interface MarkerBuilder<T extends Entity> {
    Optional<POIMarker> build(T entity);
}
