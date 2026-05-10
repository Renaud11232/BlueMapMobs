package be.renaud11232.bluemapvehicles.fabric.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.PoweredMinecart;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartFurnace;

public class FabricPoweredMinecart extends FabricVehicle<MinecartFurnace> implements PoweredMinecart {
    public FabricPoweredMinecart(MinecartFurnace wrapped) {
        super(wrapped);
    }
}
