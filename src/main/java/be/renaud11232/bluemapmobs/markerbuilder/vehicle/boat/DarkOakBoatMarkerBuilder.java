package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.DarkOakBoat;

public class DarkOakBoatMarkerBuilder extends VehicleEntityMarkerBuilder<DarkOakBoat> {
    public DarkOakBoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.DARK_OAK_BOAT);
    }
}
