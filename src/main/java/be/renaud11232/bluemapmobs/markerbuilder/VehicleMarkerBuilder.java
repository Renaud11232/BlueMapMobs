package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.vehicle.BoatMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.MinecartMarkerBuilder;
import org.bukkit.entity.*;


public class VehicleMarkerBuilder extends EntityMarkerBuilder<Vehicle> {

    public VehicleMarkerBuilder() {
        registerMarkerBuilder(Boat.class, new BoatMarkerBuilder());
        registerMarkerBuilder(Minecart.class, new MinecartMarkerBuilder());
        registerMarkerBuilder(Mob.class, new HiddenMarkerBuilder<>());
    }

}
