package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.PaleOakBoat;

public class BukkitPaleOakBoat extends BukkitEntity<org.bukkit.entity.boat.PaleOakBoat> implements PaleOakBoat {
    public BukkitPaleOakBoat(org.bukkit.entity.boat.PaleOakBoat wrapped) {
        super(wrapped);
    }
}
