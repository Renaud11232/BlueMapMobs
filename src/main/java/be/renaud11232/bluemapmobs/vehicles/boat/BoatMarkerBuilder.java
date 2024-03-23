package be.renaud11232.bluemapmobs.vehicles.boat;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Boat;
import org.bukkit.entity.ChestBoat;

import java.util.Optional;

public class BoatMarkerBuilder implements VehicleEntityMarkerBuilder<Boat> {

    private final ChestBoatMarkerBuilder chestBoatMarkerBuilder = new ChestBoatMarkerBuilder();

    @Override
    public Optional<POIMarker> build(Boat boat) {
        if (boat instanceof ChestBoat chestBoat) {
            return chestBoatMarkerBuilder.build(chestBoat);
        }
        return VehicleEntityMarkerBuilder.super.build(boat);
    }

}
