package be.renaud11232.bluemapmobs.vehicles.boat;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.Boat;
import org.bukkit.entity.ChestBoat;

import java.util.Optional;

public class BoatMarkerBuilder implements MarkerBuilder<Boat> {

    private final ChestBoatMarkerBuilder chestBoatMarkerBuilder = new ChestBoatMarkerBuilder();

    @Override
    public Optional<Marker> build(Boat boat) {
        if (boat instanceof ChestBoat chestBoat) {
            return chestBoatMarkerBuilder.build(chestBoat);
        }
        return Optional.empty();
    }

}
