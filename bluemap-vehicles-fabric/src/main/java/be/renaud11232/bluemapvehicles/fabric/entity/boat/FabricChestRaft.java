package be.renaud11232.bluemapvehicles.fabric.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.ChestRaft;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;

public class FabricChestRaft extends FabricVehicle<net.minecraft.world.entity.vehicle.boat.ChestRaft> implements ChestRaft {
    public FabricChestRaft(net.minecraft.world.entity.vehicle.boat.ChestRaft wrapped) {
        super(wrapped);
    }
}
