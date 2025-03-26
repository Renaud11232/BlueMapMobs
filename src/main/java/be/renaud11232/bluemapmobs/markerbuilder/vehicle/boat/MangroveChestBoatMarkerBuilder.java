package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.MangroveChestBoat;

public class MangroveChestBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<MangroveChestBoat> {
    public MangroveChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.MANGROVE_CHEST_BOAT);
    }
}
