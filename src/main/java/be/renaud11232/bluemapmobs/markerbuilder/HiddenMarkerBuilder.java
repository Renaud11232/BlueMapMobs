package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Entity;

import java.util.Optional;

public class HiddenMarkerBuilder<T extends Entity> implements MarkerBuilder<T> {

    @Override
    public Optional<POIMarker> buildDefault(T entity) {
        return Optional.empty();
    }
}
