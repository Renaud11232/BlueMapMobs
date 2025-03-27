package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.VehicleMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.CommandMinecart;

public class CommandMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<CommandMinecart> {
    public CommandMinecartMarkerBuilder(FileConfiguration config) {
        super(config, VehicleMarkerVisibilityConfiguration.COMMAND_MINECART, VehicleIcon.COMMAND_BLOCK_MINECART);
    }
}
