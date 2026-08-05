package be.renaud11232.bluemapvehiclemarkers.fabric.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.entity.minecart.CommandMinecart;
import be.renaud11232.bluemapvehiclemarkers.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartCommandBlock;

public class FabricCommandMinecart extends FabricVehicle<MinecartCommandBlock> implements CommandMinecart {
    public FabricCommandMinecart(MinecartCommandBlock wrapped) {
        super(wrapped);
    }
}
