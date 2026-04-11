package be.renaud11232.bluemapvehicles.plugin.entities;

import be.renaud11232.bluemapentities.entity.UknownEntity;
import be.renaud11232.bluemapvehicles.entities.Vehicle;

public class UnknownBukkitVehicle extends BukkitVehicle<org.bukkit.entity.Vehicle> implements Vehicle, UknownEntity {
    public UnknownBukkitVehicle(org.bukkit.entity.Vehicle wrapped) {
        super(wrapped);
    }
}
