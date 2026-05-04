package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.AcaciaBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitAcaciaBoat extends BukkitVehicle<org.bukkit.entity.boat.AcaciaBoat> implements AcaciaBoat {
    public BukkitAcaciaBoat(org.bukkit.entity.boat.AcaciaBoat wrapped) {
        super(wrapped);
    }
}
