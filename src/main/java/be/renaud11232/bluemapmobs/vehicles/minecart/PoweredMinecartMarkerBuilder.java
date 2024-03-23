package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.PoweredMinecart;

import java.util.Optional;

public class PoweredMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<PoweredMinecart> {
    @Override
    public Optional<Marker> build(PoweredMinecart poweredMinecart) {
        return VehicleEntityMarkerBuilder.super.build(poweredMinecart);
    }
}
