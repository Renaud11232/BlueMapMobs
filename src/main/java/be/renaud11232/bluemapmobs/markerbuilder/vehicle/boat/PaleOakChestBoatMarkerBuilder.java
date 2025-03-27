package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.icon.VehicleIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.PaleOakChestBoat;

public class PaleOakChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<PaleOakChestBoat> {
    public PaleOakChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleIcon.PALE_OAK_CHEST_BOAT);
    }
}
