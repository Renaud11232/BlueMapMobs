package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.Optional;

public interface MarkerBuilder<T> {
    Optional<POIMarker> build(T element);
}
