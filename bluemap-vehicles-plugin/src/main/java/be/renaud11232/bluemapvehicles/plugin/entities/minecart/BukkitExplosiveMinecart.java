package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.minecart.ExplosiveMinecart;

public class BukkitExplosiveMinecart extends BukkitEntity<org.bukkit.entity.minecart.ExplosiveMinecart> implements ExplosiveMinecart {
    public BukkitExplosiveMinecart(org.bukkit.entity.minecart.ExplosiveMinecart wrapped) {
        super(wrapped);
    }
}
