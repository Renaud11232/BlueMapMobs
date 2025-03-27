package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.MangroveChestBoat;

public class MangroveChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<MangroveChestBoat> {
    public MangroveChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.MANGROVE_CHEST_BOAT);
    }
}
