package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.AcaciaChestBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitAcaciaChestBoat extends BukkitVehicle<org.bukkit.entity.boat.AcaciaChestBoat> implements AcaciaChestBoat {
    public BukkitAcaciaChestBoat(org.bukkit.entity.boat.AcaciaChestBoat wrapped) {
        super(wrapped);
    }
}
