package be.renaud11232.bluemapvehicles.fabric.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.Raft;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;

public class FabricRaft extends FabricVehicle<net.minecraft.world.entity.vehicle.boat.Raft> implements Raft {
    public FabricRaft(net.minecraft.world.entity.vehicle.boat.Raft wrapped) {
        super(wrapped);
    }
}
