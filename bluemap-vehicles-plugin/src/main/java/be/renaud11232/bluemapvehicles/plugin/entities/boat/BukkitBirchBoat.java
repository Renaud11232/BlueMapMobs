package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.BirchBoat;

public class BukkitBirchBoat extends BukkitEntity<org.bukkit.entity.boat.BirchBoat> implements BirchBoat {
    public BukkitBirchBoat(org.bukkit.entity.boat.BirchBoat wrapped) {
        super(wrapped);
    }
}
