package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.AcaciaChestBoat;

public class BukkitAcaciaChestBoat extends BukkitEntity<org.bukkit.entity.boat.AcaciaChestBoat> implements AcaciaChestBoat {
    public BukkitAcaciaChestBoat(org.bukkit.entity.boat.AcaciaChestBoat wrapped) {
        super(wrapped);
    }
}
