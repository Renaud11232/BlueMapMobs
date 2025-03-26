package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.OakChestBoat;

public class OakChestBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<OakChestBoat> {
    public OakChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.OAK_CHEST_BOAT);
    }
}
