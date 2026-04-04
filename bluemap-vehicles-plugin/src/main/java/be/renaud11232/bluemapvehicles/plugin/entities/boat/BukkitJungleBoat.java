package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.JungleBoat;

public class BukkitJungleBoat extends BukkitEntity<org.bukkit.entity.boat.JungleBoat> implements JungleBoat {
    public BukkitJungleBoat(org.bukkit.entity.boat.JungleBoat wrapped) {
        super(wrapped);
    }
}
