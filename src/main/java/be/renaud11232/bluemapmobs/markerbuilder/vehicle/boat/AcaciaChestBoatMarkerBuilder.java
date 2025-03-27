package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaChestBoat;

public class AcaciaChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<AcaciaChestBoat> {
    public AcaciaChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsIcon.Vehicle.ACACIA_CHEST_BOAT);
    }
}
