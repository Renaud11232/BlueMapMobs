package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.PaleOakChestBoat;

public class PaleOakChestBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<PaleOakChestBoat> {
    public PaleOakChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.PALE_OAK_CHEST_BOAT);
    }
}
