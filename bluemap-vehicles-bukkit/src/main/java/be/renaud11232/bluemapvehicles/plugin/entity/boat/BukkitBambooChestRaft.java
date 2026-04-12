package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.BambooChestRaft;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitBambooChestRaft extends BukkitVehicle<org.bukkit.entity.boat.BambooChestRaft> implements BambooChestRaft {
    public BukkitBambooChestRaft(org.bukkit.entity.boat.BambooChestRaft wrapped) {
        super(wrapped);
    }
}
