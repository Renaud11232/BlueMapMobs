package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.PoweredMinecart;

import java.util.Optional;

public class PoweredMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<PoweredMinecart> {
    @Override
    public Optional<POIMarker> build(PoweredMinecart poweredMinecart) {
        return VehicleEntityMarkerBuilder.super.build(poweredMinecart).map(marker -> {
            marker.setIcon(Icon.POWERED_MINECART.getPath(), Icon.POWERED_MINECART.getAnchor());
            return marker;
        });
    }
}
