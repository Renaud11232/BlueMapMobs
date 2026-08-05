package be.renaud11232.bluemapvehiclemarkers.bukkit.entity;

import be.renaud11232.bluemapentitymarkers.entity.UnknownEntity;

public class BukkitUnknownVehicle extends BukkitVehicle<org.bukkit.entity.Vehicle> implements UnknownEntity {
    public BukkitUnknownVehicle(org.bukkit.entity.Vehicle wrapped) {
        super(wrapped);
    }
}
