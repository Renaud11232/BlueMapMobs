package be.renaud11232.bluemapvehicles.bukkit.entity.minecart;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.minecart.StorageMinecart;

public class BukkitStorageMinecart extends BukkitVehicle<org.bukkit.entity.minecart.StorageMinecart> implements StorageMinecart {
    public BukkitStorageMinecart(org.bukkit.entity.minecart.StorageMinecart wrapped) {
        super(wrapped);
    }
}
