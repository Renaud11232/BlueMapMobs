package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BirchChestBoat;

public class BirchChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<BirchChestBoat> {
    public BirchChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsIcon.Vehicle.BIRCH_CHEST_BOAT);
    }
}
