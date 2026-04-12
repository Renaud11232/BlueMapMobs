package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.AcaciaBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitAcaciaBoat extends BukkitVehicle<org.bukkit.entity.boat.AcaciaBoat> implements AcaciaBoat {
    public BukkitAcaciaBoat(org.bukkit.entity.boat.AcaciaBoat wrapped) {
        super(wrapped);
    }
}
