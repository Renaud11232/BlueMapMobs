package be.renaud11232.bluemapvehiclemarkers.fabric.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.entity.minecart.PoweredMinecart;
import be.renaud11232.bluemapvehiclemarkers.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartFurnace;

public class FabricPoweredMinecart extends FabricVehicle<MinecartFurnace> implements PoweredMinecart {
    public FabricPoweredMinecart(MinecartFurnace wrapped) {
        super(wrapped);
    }
}
