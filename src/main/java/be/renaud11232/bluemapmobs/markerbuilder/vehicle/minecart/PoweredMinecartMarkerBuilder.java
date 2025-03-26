package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.PoweredMinecart;

public class PoweredMinecartMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<PoweredMinecart> {
    public PoweredMinecartMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.vehicles.markers.types.powered_minecart", Icon.FURNACE_MINECART);
    }
}
