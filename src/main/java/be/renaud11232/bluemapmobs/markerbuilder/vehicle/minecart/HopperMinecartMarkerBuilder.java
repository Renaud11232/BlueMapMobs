package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.HopperMinecart;

public class HopperMinecartMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<HopperMinecart> {
    public HopperMinecartMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.vehicles.markers.types.hopper_minecart", Icon.HOPPER_MINECART);
    }
}
