package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.CherryBoat;

public class CherryBoatMarkerBuilder extends VehicleEntityMarkerBuilder<CherryBoat> {
    public CherryBoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.CHERRY_BOAT);
    }
}
