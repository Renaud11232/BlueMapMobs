package be.renaud11232.bluemapvehicles.fabric.entity;

import be.renaud11232.bluemapentities.fabric.entity.FabricEntity;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import net.minecraft.world.entity.vehicle.VehicleEntity;

public abstract class FabricVehicle<T extends VehicleEntity> extends FabricEntity<T> implements Vehicle {
    public FabricVehicle(T wrapped) {
        super(wrapped);
    }
}
