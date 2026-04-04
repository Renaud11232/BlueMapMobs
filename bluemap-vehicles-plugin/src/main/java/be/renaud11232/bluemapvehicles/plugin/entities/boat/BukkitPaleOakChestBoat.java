package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.PaleOakChestBoat;

public class BukkitPaleOakChestBoat extends BukkitEntity<org.bukkit.entity.boat.PaleOakChestBoat> implements PaleOakChestBoat {
    public BukkitPaleOakChestBoat(org.bukkit.entity.boat.PaleOakChestBoat wrapped) {
        super(wrapped);
    }
}
