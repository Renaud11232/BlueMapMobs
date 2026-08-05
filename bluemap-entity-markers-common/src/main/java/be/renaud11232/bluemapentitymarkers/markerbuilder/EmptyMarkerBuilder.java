package be.renaud11232.bluemapentitymarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.entity.Entity;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.Optional;

public class EmptyMarkerBuilder<T extends Entity> implements MarkerBuilder<T> {
    @Override
    public Optional<POIMarker> build(T entity) {
        return Optional.empty();
    }
}
