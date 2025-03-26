package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.DarkOakBoat;

public class DarkOakBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<DarkOakBoat> {
    public DarkOakBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.DARK_OAK_BOAT);
    }
}
