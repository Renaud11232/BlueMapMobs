package be.renaud11232.bluemapvehicles.fabric.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.RideableMinecart;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.Minecart;

public class FabricRideableMinecart extends FabricVehicle<Minecart> implements RideableMinecart {
    public FabricRideableMinecart(Minecart wrapped) {
        super(wrapped);
    }
}
