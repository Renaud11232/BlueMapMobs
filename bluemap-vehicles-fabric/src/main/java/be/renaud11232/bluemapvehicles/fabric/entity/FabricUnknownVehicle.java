package be.renaud11232.bluemapvehicles.fabric.entity;

import be.renaud11232.bluemapentities.entity.UnknownEntity;
import net.minecraft.world.entity.vehicle.VehicleEntity;

public class FabricUnknownVehicle extends FabricVehicle<VehicleEntity> implements UnknownEntity {
    public FabricUnknownVehicle(VehicleEntity wrapped) {
        super(wrapped);
    }
}
