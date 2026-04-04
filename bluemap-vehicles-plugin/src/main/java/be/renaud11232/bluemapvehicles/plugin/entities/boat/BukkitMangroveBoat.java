package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.MangroveBoat;

public class BukkitMangroveBoat extends BukkitEntity<org.bukkit.entity.boat.MangroveBoat> implements MangroveBoat {
    public BukkitMangroveBoat(org.bukkit.entity.boat.MangroveBoat wrapped) {
        super(wrapped);
    }
}
