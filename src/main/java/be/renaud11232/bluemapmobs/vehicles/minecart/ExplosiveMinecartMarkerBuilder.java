package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.ExplosiveMinecart;

import java.util.Optional;

public class ExplosiveMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<ExplosiveMinecart> {
    @Override
    public Optional<POIMarker> build(ExplosiveMinecart explosiveMinecart) {
        return VehicleEntityMarkerBuilder.super.build(explosiveMinecart).map(marker -> {
            marker.setIcon(Icon.TNT_MINECART.getPath(), Icon.TNT_MINECART.getAnchor());
            return marker;
        });
    }
}
