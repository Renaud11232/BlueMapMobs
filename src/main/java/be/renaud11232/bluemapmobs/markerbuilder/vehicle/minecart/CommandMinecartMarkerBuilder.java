package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.CommandMinecart;

public class CommandMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<CommandMinecart> {
    public CommandMinecartMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.COMMAND_MINECART, BlueMapMobsIcon.Vehicle.COMMAND_BLOCK_MINECART);
    }
}
