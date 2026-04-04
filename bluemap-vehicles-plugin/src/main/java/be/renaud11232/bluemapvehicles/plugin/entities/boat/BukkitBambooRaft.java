package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.BambooRaft;

public class BukkitBambooRaft extends BukkitEntity<org.bukkit.entity.boat.BambooRaft> implements BambooRaft {
    public BukkitBambooRaft(org.bukkit.entity.boat.BambooRaft wrapped) {
        super(wrapped);
    }
}
