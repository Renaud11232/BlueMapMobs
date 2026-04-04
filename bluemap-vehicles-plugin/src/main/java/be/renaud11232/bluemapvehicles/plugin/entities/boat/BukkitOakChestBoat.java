package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.OakChestBoat;

public class BukkitOakChestBoat extends BukkitEntity<org.bukkit.entity.boat.OakChestBoat> implements OakChestBoat {
    public BukkitOakChestBoat(org.bukkit.entity.boat.OakChestBoat wrapped) {
        super(wrapped);
    }
}
