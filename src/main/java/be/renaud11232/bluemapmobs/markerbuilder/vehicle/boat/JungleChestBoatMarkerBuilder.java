package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.JungleChestBoat;

public class JungleChestBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<JungleChestBoat> {
    public JungleChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.JUNGLE_CHEST_BOAT);
    }
}
