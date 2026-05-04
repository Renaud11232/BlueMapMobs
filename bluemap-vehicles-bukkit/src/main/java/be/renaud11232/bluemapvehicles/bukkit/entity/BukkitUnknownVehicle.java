package be.renaud11232.bluemapvehicles.bukkit.entity;

import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapvehicles.entity.Vehicle;

public class BukkitUnknownVehicle extends BukkitVehicle<org.bukkit.entity.Vehicle> implements Vehicle, UnknownEntity {
    public BukkitUnknownVehicle(org.bukkit.entity.Vehicle wrapped) {
        super(wrapped);
    }
}
