package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.minecart.ExplosiveMinecart;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitExplosiveMinecart extends BukkitVehicle<org.bukkit.entity.minecart.ExplosiveMinecart> implements ExplosiveMinecart {
    public BukkitExplosiveMinecart(org.bukkit.entity.minecart.ExplosiveMinecart wrapped) {
        super(wrapped);
    }
}
