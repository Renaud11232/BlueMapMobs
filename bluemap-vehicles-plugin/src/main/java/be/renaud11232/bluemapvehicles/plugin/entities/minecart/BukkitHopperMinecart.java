package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.minecart.HopperMinecart;

public class BukkitHopperMinecart extends BukkitEntity<org.bukkit.entity.minecart.HopperMinecart> implements HopperMinecart {
    public BukkitHopperMinecart(org.bukkit.entity.minecart.HopperMinecart wrapped) {
        super(wrapped);
    }
}
