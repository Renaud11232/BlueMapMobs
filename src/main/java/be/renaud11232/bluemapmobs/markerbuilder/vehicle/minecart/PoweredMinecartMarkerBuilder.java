package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.PoweredMinecart;

public class PoweredMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<PoweredMinecart> {
    public PoweredMinecartMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Vehicles.Markers.Types.POWERED_MINECART, VehicleIcon.FURNACE_MINECART);
    }
}
