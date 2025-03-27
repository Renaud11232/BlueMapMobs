package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BirchChestBoat;

public class BirchChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<BirchChestBoat> {
    public BirchChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.BIRCH_CHEST_BOAT);
    }
}
