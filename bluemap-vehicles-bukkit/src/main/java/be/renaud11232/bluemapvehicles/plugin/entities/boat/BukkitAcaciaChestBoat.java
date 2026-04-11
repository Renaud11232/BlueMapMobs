package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.AcaciaChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitAcaciaChestBoat extends BukkitVehicle<org.bukkit.entity.boat.AcaciaChestBoat> implements AcaciaChestBoat {
    public BukkitAcaciaChestBoat(org.bukkit.entity.boat.AcaciaChestBoat wrapped) {
        super(wrapped);
    }
}
