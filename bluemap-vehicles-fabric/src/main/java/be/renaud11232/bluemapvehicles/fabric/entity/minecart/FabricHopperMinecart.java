package be.renaud11232.bluemapvehicles.fabric.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.HopperMinecart;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartHopper;

public class FabricHopperMinecart extends FabricVehicle<MinecartHopper> implements HopperMinecart {
    public FabricHopperMinecart(MinecartHopper wrapped) {
        super(wrapped);
    }
}
