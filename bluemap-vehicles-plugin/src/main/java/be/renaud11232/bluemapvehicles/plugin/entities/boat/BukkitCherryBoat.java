package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.CherryBoat;

public class BukkitCherryBoat extends BukkitEntity<org.bukkit.entity.boat.CherryBoat> implements CherryBoat {
    public BukkitCherryBoat(org.bukkit.entity.boat.CherryBoat wrapped) {
        super(wrapped);
    }
}
