package be.renaud11232.bluemapvehicles.bukkit.entity;

import be.renaud11232.bluemapentities.entity.UnknownEntity;

public class BukkitUnknownVehicle extends BukkitVehicle<org.bukkit.entity.Vehicle> implements UnknownEntity {
    public BukkitUnknownVehicle(org.bukkit.entity.Vehicle wrapped) {
        super(wrapped);
    }
}
