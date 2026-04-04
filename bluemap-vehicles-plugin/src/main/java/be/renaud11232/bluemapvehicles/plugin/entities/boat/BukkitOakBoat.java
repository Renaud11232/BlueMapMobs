package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.OakBoat;

public class BukkitOakBoat extends BukkitEntity<org.bukkit.entity.boat.OakBoat> implements OakBoat {
    public BukkitOakBoat(org.bukkit.entity.boat.OakBoat wrapped) {
        super(wrapped);
    }
}
