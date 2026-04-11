package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.minecart.StorageMinecart;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitStorageMinecart extends BukkitVehicle<org.bukkit.entity.minecart.StorageMinecart> implements StorageMinecart {
    public BukkitStorageMinecart(org.bukkit.entity.minecart.StorageMinecart wrapped) {
        super(wrapped);
    }
}
