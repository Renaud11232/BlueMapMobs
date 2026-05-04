package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.BambooRaft;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitBambooRaft extends BukkitVehicle<org.bukkit.entity.boat.BambooRaft> implements BambooRaft {
    public BukkitBambooRaft(org.bukkit.entity.boat.BambooRaft wrapped) {
        super(wrapped);
    }
}
