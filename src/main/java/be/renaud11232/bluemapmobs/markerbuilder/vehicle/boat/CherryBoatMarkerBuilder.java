package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.CherryBoat;

public class CherryBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<CherryBoat> {
    public CherryBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.CHERRY_BOAT);
    }
}
