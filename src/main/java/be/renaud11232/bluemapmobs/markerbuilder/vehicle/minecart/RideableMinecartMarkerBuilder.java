package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.RideableMinecart;

public class RideableMinecartMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<RideableMinecart> {
    public RideableMinecartMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.vehicles.markers.types.rideable_minecart", Icon.MINECART);
    }
}
