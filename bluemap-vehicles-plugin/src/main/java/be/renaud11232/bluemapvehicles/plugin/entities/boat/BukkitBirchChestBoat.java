package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.BirchChestBoat;

public class BukkitBirchChestBoat extends BukkitEntity<org.bukkit.entity.boat.BirchChestBoat> implements BirchChestBoat {
    public BukkitBirchChestBoat(org.bukkit.entity.boat.BirchChestBoat wrapped) {
        super(wrapped);
    }
}
