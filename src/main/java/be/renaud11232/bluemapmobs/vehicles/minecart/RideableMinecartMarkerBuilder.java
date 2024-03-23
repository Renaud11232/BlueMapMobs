package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.RideableMinecart;

import java.util.Optional;

public class RideableMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<RideableMinecart> {
    @Override
    public Optional<Marker> build(RideableMinecart entity) {
        return Optional.empty();
    }
}
