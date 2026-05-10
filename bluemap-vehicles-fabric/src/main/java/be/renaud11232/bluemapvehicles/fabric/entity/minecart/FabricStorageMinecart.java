package be.renaud11232.bluemapvehicles.fabric.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.StorageMinecart;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartChest;

public class FabricStorageMinecart extends FabricVehicle<MinecartChest> implements StorageMinecart {
    public FabricStorageMinecart(MinecartChest wrapped) {
        super(wrapped);
    }
}
