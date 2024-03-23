package be.renaud11232.bluemapmobs.vehicles.boat;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.ChestBoat;

import java.util.Optional;

public class ChestBoatMarkerBuilder implements MarkerBuilder<ChestBoat> {

    @Override
    public Optional<Marker> build(ChestBoat entity) {
        return Optional.empty();
    }

}
