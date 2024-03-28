package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.vehicle.BoatMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.MinecartMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;


public class VehicleMarkerBuilder extends VehicleEntityMarkerBuilder<Vehicle> {

    public VehicleMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Boat.class, new BoatMarkerBuilder(config));
        registerMarkerBuilder(Minecart.class, new MinecartMarkerBuilder(config));
    }

}
