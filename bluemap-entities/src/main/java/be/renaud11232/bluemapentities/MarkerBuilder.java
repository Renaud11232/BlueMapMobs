package be.renaud11232.bluemapentities;

import be.renaud11232.bluemapentities.entity.Entity;
import de.bluecolored.bluemap.api.markers.Marker;

import java.util.Optional;

public interface MarkerBuilder<T extends Entity> {
    Optional<Marker> build(T entity);
}
