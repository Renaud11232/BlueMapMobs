package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.BambooChestRaft;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitBambooChestRaft extends BukkitVehicle<org.bukkit.entity.boat.BambooChestRaft> implements BambooChestRaft {
    public BukkitBambooChestRaft(org.bukkit.entity.boat.BambooChestRaft wrapped) {
        super(wrapped);
    }
}
