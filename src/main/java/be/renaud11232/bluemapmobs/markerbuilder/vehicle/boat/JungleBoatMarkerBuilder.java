package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.JungleBoat;

public class JungleBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<JungleBoat> {
    public JungleBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.JUNGLE_BOAT);
    }
}
