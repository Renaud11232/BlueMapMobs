package be.renaud11232.bluemapvehicles.plugin.entities;

import be.renaud11232.bluemapentities.entity.UnsupportedEntity;
import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.Vehicle;

public class UnsupportedBukkitVehicle extends BukkitEntity<org.bukkit.entity.Vehicle> implements Vehicle, UnsupportedEntity {
    public UnsupportedBukkitVehicle(org.bukkit.entity.Vehicle wrapped) {
        super(wrapped);
    }
}
