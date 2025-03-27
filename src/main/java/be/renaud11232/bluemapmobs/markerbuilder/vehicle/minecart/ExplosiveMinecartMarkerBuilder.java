package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.VehicleMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.ExplosiveMinecart;

public class ExplosiveMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<ExplosiveMinecart> {
    public ExplosiveMinecartMarkerBuilder(FileConfiguration config) {
        super(config, VehicleMarkerVisibilityConfiguration.EXPLOSIVE_MINECART, VehicleIcon.TNT_MINECART);
    }
}
