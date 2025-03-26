package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BirchBoat;

public class BirchBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<BirchBoat> {
    public BirchBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.BIRCH_BOAT);
    }
}
