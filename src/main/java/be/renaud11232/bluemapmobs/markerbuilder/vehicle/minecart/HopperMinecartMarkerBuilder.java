package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.VehicleMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.HopperMinecart;

public class HopperMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<HopperMinecart> {
    public HopperMinecartMarkerBuilder(FileConfiguration config) {
        super(config, VehicleMarkerVisibilityConfiguration.HOPPER_MINECART, VehicleIcon.HOPPER_MINECART);
    }
}
