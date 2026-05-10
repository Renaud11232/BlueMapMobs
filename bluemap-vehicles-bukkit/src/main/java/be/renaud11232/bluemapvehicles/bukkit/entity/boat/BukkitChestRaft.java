package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.boat.ChestRaft;
import org.bukkit.entity.boat.BambooChestRaft;

public class BukkitChestRaft extends BukkitVehicle<BambooChestRaft> implements ChestRaft {
    public BukkitChestRaft(BambooChestRaft wrapped) {
        super(wrapped);
    }
}
