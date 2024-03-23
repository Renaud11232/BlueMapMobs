package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.HopperMinecart;

import java.util.Optional;

public class HopperMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<HopperMinecart> {
    @Override
    public Optional<POIMarker> build(HopperMinecart hopperMinecart) {
        return VehicleEntityMarkerBuilder.super.build(hopperMinecart).map(marker -> {
            marker.setIcon(Icon.HOPPER_MINECART.getPath(), Icon.HOPPER_MINECART.getAnchor());
            return marker;
        });
    }
}
