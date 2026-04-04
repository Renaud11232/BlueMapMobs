package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.BambooChestRaft;

public class BukkitBambooChestRaft extends BukkitEntity<org.bukkit.entity.boat.BambooChestRaft> implements BambooChestRaft {
    public BukkitBambooChestRaft(org.bukkit.entity.boat.BambooChestRaft wrapped) {
        super(wrapped);
    }
}
