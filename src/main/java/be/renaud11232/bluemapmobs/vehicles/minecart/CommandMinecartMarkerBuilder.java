package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.CommandMinecart;

import java.util.Optional;

public class CommandMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<CommandMinecart> {
    @Override
    public Optional<Marker> build(CommandMinecart commandMinecart) {
        return VehicleEntityMarkerBuilder.super.build(commandMinecart);
    }
}
