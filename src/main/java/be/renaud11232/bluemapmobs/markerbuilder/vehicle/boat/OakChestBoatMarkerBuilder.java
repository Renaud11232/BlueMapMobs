package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.OakChestBoat;

public class OakChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<OakChestBoat> {
    public OakChestBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsIcon.Vehicle.OAK_CHEST_BOAT);
    }
}
