package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.OakBoat;

public class OakBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<OakBoat> {
    public OakBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.OAK_BOAT);
    }
}
