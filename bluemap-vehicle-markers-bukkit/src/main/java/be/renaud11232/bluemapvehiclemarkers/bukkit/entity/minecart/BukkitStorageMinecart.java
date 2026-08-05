package be.renaud11232.bluemapvehiclemarkers.bukkit.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.StorageMinecart;

public class BukkitStorageMinecart extends BukkitVehicle<org.bukkit.entity.minecart.StorageMinecart> implements StorageMinecart {
    public BukkitStorageMinecart(org.bukkit.entity.minecart.StorageMinecart wrapped) {
        super(wrapped);
    }
}
