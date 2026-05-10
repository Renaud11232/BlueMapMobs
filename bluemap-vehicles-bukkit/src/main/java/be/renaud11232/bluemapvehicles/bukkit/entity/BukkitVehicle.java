package be.renaud11232.bluemapvehicles.bukkit.entity;

import be.renaud11232.bluemapentities.bukkit.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entity.Vehicle;

public abstract class BukkitVehicle<T extends org.bukkit.entity.Vehicle> extends BukkitEntity<T> implements Vehicle {
    public BukkitVehicle(T wrapped) {
        super(wrapped);
    }
}
