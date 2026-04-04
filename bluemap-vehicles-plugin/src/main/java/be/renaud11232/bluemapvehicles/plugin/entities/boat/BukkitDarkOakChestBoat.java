package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.DarkOakChestBoat;

public class BukkitDarkOakChestBoat extends BukkitEntity<org.bukkit.entity.boat.DarkOakChestBoat> implements DarkOakChestBoat {
    public BukkitDarkOakChestBoat(org.bukkit.entity.boat.DarkOakChestBoat wrapped) {
        super(wrapped);
    }
}
