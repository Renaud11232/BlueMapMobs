package be.renaud11232.bluemapvehicles.plugin.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.StorageMinecart;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitStorageMinecart extends BukkitVehicle<org.bukkit.entity.minecart.StorageMinecart> implements StorageMinecart {
    public BukkitStorageMinecart(org.bukkit.entity.minecart.StorageMinecart wrapped) {
        super(wrapped);
    }
}
