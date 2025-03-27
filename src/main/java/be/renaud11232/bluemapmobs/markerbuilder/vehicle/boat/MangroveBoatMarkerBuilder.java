package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.MangroveBoat;

public class MangroveBoatMarkerBuilder extends VehicleEntityMarkerBuilder<MangroveBoat> {
    public MangroveBoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.MANGROVE_BOAT);
    }
}
