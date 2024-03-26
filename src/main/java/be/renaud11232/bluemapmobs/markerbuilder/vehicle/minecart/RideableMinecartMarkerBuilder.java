package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.RideableMinecart;

import java.util.Optional;

public class RideableMinecartMarkerBuilder extends EntityMarkerBuilder<RideableMinecart> {
    @Override
    public Optional<POIMarker> buildDefault(RideableMinecart rideableMinecart) {
        return super.buildDefault(rideableMinecart).map(marker -> {
            marker.setIcon(Icon.MINECART.getPath(), Icon.MINECART.getAnchor());
            return marker;
        });
    }
}