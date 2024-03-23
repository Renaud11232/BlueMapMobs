package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.HopperMinecart;

import java.util.Optional;

public class HopperMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<HopperMinecart> {
    @Override
    public Optional<Marker> build(HopperMinecart entity) {
        return Optional.empty();
    }
}
