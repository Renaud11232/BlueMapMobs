package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.MangroveBoat;

public class MangroveBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<MangroveBoat> {
    public MangroveBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.MANGROVE_BOAT);
    }
}
