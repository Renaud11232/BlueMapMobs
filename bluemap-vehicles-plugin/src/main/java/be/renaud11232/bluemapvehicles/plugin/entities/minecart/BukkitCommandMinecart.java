package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.minecart.CommandMinecart;

public class BukkitCommandMinecart extends BukkitEntity<org.bukkit.entity.minecart.CommandMinecart> implements CommandMinecart {
    public BukkitCommandMinecart(org.bukkit.entity.minecart.CommandMinecart wrapped) {
        super(wrapped);
    }
}
