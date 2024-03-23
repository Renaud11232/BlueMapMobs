package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.ExplosiveMinecart;

import java.util.Optional;

public class ExplosiveMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<ExplosiveMinecart> {
    @Override
    public Optional<Marker> build(ExplosiveMinecart explosiveMinecart) {
        return VehicleEntityMarkerBuilder.super.build(explosiveMinecart);
    }
}
