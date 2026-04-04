package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.AcaciaBoat;

public class BukkitAcaciaBoat extends BukkitEntity<org.bukkit.entity.boat.AcaciaBoat> implements AcaciaBoat {
    public BukkitAcaciaBoat(org.bukkit.entity.boat.AcaciaBoat wrapped) {
        super(wrapped);
    }
}
