package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.SpruceChestBoat;

public class BukkitSpruceChestBoat extends BukkitEntity<org.bukkit.entity.boat.SpruceChestBoat> implements SpruceChestBoat {
    public BukkitSpruceChestBoat(org.bukkit.entity.boat.SpruceChestBoat wrapped) {
        super(wrapped);
    }
}
