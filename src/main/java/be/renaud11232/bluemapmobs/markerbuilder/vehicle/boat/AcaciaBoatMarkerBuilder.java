package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaBoat;

public class AcaciaBoatMarkerBuilder extends VehicleEntityMarkerBuilder<AcaciaBoat> {
    public AcaciaBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsIcon.Vehicle.ACACIA_BOAT);
    }
}
