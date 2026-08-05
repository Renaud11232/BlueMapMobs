package be.renaud11232.bluemapvehiclemarkers.fabric.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.entity.minecart.ExplosiveMinecart;
import be.renaud11232.bluemapvehiclemarkers.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartTNT;

public class FabricExplosiveMinecart extends FabricVehicle<MinecartTNT> implements ExplosiveMinecart {
    public FabricExplosiveMinecart(MinecartTNT wrapped) {
        super(wrapped);
    }
}
