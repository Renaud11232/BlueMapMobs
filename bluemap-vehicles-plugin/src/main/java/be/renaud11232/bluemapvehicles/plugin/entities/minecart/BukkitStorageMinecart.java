package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.minecart.StorageMinecart;

public class BukkitStorageMinecart extends BukkitEntity<org.bukkit.entity.minecart.StorageMinecart> implements StorageMinecart {
    public BukkitStorageMinecart(org.bukkit.entity.minecart.StorageMinecart wrapped) {
        super(wrapped);
    }
}
