package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.vehicles.boat.BoatMarkerBuilder;
import be.renaud11232.bluemapmobs.vehicles.minecart.MinecartMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Vehicle;

import java.util.Optional;

public class VehicleMarkerBuilder implements VehicleEntityMarkerBuilder<Vehicle> {

    private final BoatMarkerBuilder boatMarkerBuilder = new BoatMarkerBuilder();
    private final MinecartMarkerBuilder minecartMarkerBuilder = new MinecartMarkerBuilder();

    @Override
    public Optional<POIMarker> build(Vehicle vehicle) {
        if (vehicle instanceof Boat boat) {
            return boatMarkerBuilder.build(boat);
        } else if (vehicle instanceof Minecart minecart) {
            return minecartMarkerBuilder.build(minecart);
        }
        return Optional.empty();
    }
}
