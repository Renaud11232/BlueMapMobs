package be.renaud11232.bluemapvehicles.fabric.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.SpawnerMinecart;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.vehicle.minecart.MinecartSpawner;

public class FabricSpawnerMinecart extends FabricVehicle<MinecartSpawner> implements SpawnerMinecart {
    public FabricSpawnerMinecart(MinecartSpawner wrapped) {
        super(wrapped);
    }
}
