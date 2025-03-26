package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.ExplosiveMinecart;

public class ExplosiveMinecartMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<ExplosiveMinecart> {
    public ExplosiveMinecartMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.vehicles.markers.types.explosive_minecart", Icon.TNT_MINECART);
    }
}
