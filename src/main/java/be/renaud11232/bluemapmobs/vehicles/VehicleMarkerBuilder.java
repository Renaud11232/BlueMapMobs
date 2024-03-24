package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.EntityMarkerBuilder;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Vehicle;


public class VehicleMarkerBuilder extends EntityMarkerBuilder<Vehicle> {

    public VehicleMarkerBuilder() {
        registerMarkerBuilder(Boat.class, new BoatMarkerBuilder());
        registerMarkerBuilder(Minecart.class, new MinecartMarkerBuilder());
    }

}
