package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.SpruceBoat;

public class BukkitSpruceBoat extends BukkitEntity<org.bukkit.entity.boat.SpruceBoat> implements SpruceBoat {
    public BukkitSpruceBoat(org.bukkit.entity.boat.SpruceBoat wrapped) {
        super(wrapped);
    }
}
