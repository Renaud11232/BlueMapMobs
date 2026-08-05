package be.renaud11232.bluemapvehiclemarkers.bukkit.entity.boat;

import be.renaud11232.bluemapvehiclemarkers.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.ChestRaft;
import org.bukkit.entity.boat.BambooChestRaft;

public class BukkitChestRaft extends BukkitVehicle<BambooChestRaft> implements ChestRaft {
    public BukkitChestRaft(BambooChestRaft wrapped) {
        super(wrapped);
    }
}
