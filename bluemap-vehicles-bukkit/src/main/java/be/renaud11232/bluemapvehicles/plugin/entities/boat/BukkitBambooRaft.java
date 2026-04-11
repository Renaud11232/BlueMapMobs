package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.BambooRaft;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitBambooRaft extends BukkitVehicle<org.bukkit.entity.boat.BambooRaft> implements BambooRaft {
    public BukkitBambooRaft(org.bukkit.entity.boat.BambooRaft wrapped) {
        super(wrapped);
    }
}
