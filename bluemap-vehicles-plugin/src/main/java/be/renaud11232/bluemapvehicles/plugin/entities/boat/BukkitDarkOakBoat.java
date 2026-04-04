package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.DarkOakBoat;

public class BukkitDarkOakBoat extends BukkitEntity<org.bukkit.entity.boat.DarkOakBoat> implements DarkOakBoat {
    public BukkitDarkOakBoat(org.bukkit.entity.boat.DarkOakBoat wrapped) {
        super(wrapped);
    }
}
