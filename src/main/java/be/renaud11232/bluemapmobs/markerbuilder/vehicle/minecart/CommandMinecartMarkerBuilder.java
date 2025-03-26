package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.CommandMinecart;

public class CommandMinecartMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<CommandMinecart> {
    public CommandMinecartMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.vehicles.markers.types.command_minecart", Icon.COMMAND_BLOCK_MINECART);
    }
}
