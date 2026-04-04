package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.minecart.PoweredMinecart;

public class BukkitPoweredMinecart extends BukkitEntity<org.bukkit.entity.minecart.PoweredMinecart> implements PoweredMinecart {
    public BukkitPoweredMinecart(org.bukkit.entity.minecart.PoweredMinecart wrapped) {
        super(wrapped);
    }
}
