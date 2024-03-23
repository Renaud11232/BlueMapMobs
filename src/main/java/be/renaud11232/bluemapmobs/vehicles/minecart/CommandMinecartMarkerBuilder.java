package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.CommandMinecart;

import java.util.Optional;

public class CommandMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<CommandMinecart> {
    @Override
    public Optional<POIMarker> build(CommandMinecart commandMinecart) {
        return VehicleEntityMarkerBuilder.super.build(commandMinecart).map(marker -> {
            marker.setIcon(Icon.COMMAND_MINECART.getPath(), Icon.COMMAND_MINECART.getAnchor());
            return marker;
        });
    }
}
