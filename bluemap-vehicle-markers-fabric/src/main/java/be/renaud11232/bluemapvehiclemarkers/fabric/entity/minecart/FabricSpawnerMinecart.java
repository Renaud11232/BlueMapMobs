package be.renaud11232.bluemapvehiclemarkers.fabric.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.entity.minecart.SpawnerMinecart;
import be.renaud11232.bluemapvehiclemarkers.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartSpawner;

public class FabricSpawnerMinecart extends FabricVehicle<MinecartSpawner> implements SpawnerMinecart {
    public FabricSpawnerMinecart(MinecartSpawner wrapped) {
        super(wrapped);
    }
}
