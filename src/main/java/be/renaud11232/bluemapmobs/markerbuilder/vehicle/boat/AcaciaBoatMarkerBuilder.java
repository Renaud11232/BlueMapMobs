package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconVehicleEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaBoat;

public class AcaciaBoatMarkerBuilder extends SingleIconVehicleEntityMarkerBuilder<AcaciaBoat> {
    public AcaciaBoatMarkerBuilder(FileConfiguration config) {
        super(config, Icon.ACACIA_BOAT);
    }
}
