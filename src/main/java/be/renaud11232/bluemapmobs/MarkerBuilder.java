package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.Entity;

import java.util.Optional;

public interface MarkerBuilder<T extends Entity> {

    Optional<Marker> build(T entity);

}
