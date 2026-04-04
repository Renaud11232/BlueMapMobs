package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.MangroveChestBoat;

public class BukkitMangroveChestBoat extends BukkitEntity<org.bukkit.entity.boat.MangroveChestBoat> implements MangroveChestBoat {
    public BukkitMangroveChestBoat(org.bukkit.entity.boat.MangroveChestBoat wrapped) {
        super(wrapped);
    }
}
