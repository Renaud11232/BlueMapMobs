package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.boat.JungleChestBoat;

public class BukkitJungleChestBoat extends BukkitEntity<org.bukkit.entity.boat.JungleChestBoat> implements JungleChestBoat {
    public BukkitJungleChestBoat(org.bukkit.entity.boat.JungleChestBoat wrapped) {
        super(wrapped);
    }
}
