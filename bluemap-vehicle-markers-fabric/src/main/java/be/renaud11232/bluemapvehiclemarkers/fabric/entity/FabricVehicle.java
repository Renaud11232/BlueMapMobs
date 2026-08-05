package be.renaud11232.bluemapvehiclemarkers.fabric.entity;

import be.renaud11232.bluemapentitymarkers.fabric.entity.FabricEntity;
import be.renaud11232.bluemapvehiclemarkers.entity.Vehicle;
import net.minecraft.world.entity.vehicle.VehicleEntity;

public abstract class FabricVehicle<T extends VehicleEntity> extends FabricEntity<T> implements Vehicle {
    public FabricVehicle(T wrapped) {
        super(wrapped);
    }
}
