package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.AcaciaBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitAcaciaBoat extends BukkitVehicle<org.bukkit.entity.boat.AcaciaBoat> implements AcaciaBoat {
    public BukkitAcaciaBoat(org.bukkit.entity.boat.AcaciaBoat wrapped) {
        super(wrapped);
    }
}
