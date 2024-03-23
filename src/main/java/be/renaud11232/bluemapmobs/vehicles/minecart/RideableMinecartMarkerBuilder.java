package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.RideableMinecart;

import java.util.Optional;

public class RideableMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<RideableMinecart> {
    @Override
    public Optional<POIMarker> build(RideableMinecart rideableMinecart) {
        return VehicleEntityMarkerBuilder.super.build(rideableMinecart).map(marker -> {
            marker.setIcon(Icon.MINECART.getPath(), Icon.MINECART.getAnchor());
            return marker;
        });
    }
}
