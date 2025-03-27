package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BirchBoat;

public class BirchBoatMarkerBuilder extends VehicleEntityMarkerBuilder<BirchBoat> {
    public BirchBoatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsIcon.Vehicle.BIRCH_BOAT);
    }
}
