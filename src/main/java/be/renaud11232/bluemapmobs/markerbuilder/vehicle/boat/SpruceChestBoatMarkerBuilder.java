package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.SpruceChestBoat;

public class SpruceChestBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<SpruceChestBoat> {
    public SpruceChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.SPRUCE_CHEST_BOAT);
    }
}
