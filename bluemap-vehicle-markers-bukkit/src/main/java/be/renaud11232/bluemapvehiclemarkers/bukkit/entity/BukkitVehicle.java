package be.renaud11232.bluemapvehiclemarkers.bukkit.entity;

import be.renaud11232.bluemapentitymarkers.bukkit.entity.BukkitEntity;
import be.renaud11232.bluemapvehiclemarkers.entity.Vehicle;

public abstract class BukkitVehicle<T extends org.bukkit.entity.Vehicle> extends BukkitEntity<T> implements Vehicle {
    public BukkitVehicle(T wrapped) {
        super(wrapped);
    }
}
