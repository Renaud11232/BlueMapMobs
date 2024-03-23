package be.renaud11232.bluemapmobs.vehicles.boat;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.ChestBoat;

import java.util.Optional;

public class ChestBoatMarkerBuilder implements VehicleEntityMarkerBuilder<ChestBoat> {

    @Override
    public Optional<POIMarker> build(ChestBoat chestBoat) {
        return VehicleEntityMarkerBuilder.super.build(chestBoat);
    }

}
