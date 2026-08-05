package be.renaud11232.bluemapvehiclemarkers.fabric.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.entity.minecart.StorageMinecart;
import be.renaud11232.bluemapvehiclemarkers.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartChest;

public class FabricStorageMinecart extends FabricVehicle<MinecartChest> implements StorageMinecart {
    public FabricStorageMinecart(MinecartChest wrapped) {
        super(wrapped);
    }
}
