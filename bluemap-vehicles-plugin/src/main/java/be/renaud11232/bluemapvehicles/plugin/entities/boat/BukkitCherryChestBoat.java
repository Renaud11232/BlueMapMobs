package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.CherryChestBoat;

public class BukkitCherryChestBoat extends BukkitEntity<org.bukkit.entity.boat.CherryChestBoat> implements CherryChestBoat {
    public BukkitCherryChestBoat(org.bukkit.entity.boat.CherryChestBoat wrapped) {
        super(wrapped);
    }
}
