package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.CherryChestBoat;

public class CherryChestBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<CherryChestBoat> {
    public CherryChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.CHERRY_CHEST_BOAT);
    }
}
