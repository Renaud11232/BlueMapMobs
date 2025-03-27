package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.CherryChestBoat;

public class CherryChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<CherryChestBoat> {
    public CherryChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsIcon.Vehicle.CHERRY_CHEST_BOAT);
    }
}
