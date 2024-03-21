package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.Boat;

import java.util.Optional;

public class BoatMarkerBuilder implements MarkerBuilder<Boat> {
    @Override
    public Optional<Marker> build(Boat entity) {
        return Optional.empty();
    }
}
