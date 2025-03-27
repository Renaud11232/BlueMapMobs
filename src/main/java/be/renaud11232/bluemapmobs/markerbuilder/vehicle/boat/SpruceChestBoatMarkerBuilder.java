package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.SpruceChestBoat;

public class SpruceChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<SpruceChestBoat> {
    public SpruceChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.SPRUCE_CHEST_BOAT);
    }
}
