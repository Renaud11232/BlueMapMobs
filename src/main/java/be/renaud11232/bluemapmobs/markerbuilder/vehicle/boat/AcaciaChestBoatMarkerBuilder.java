package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaChestBoat;

public class AcaciaChestBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<AcaciaChestBoat> {
    public AcaciaChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.ACACIA_CHEST_BOAT);
    }
}
