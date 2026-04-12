package be.renaud11232.bluemapvehicles.plugin.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.ExplosiveMinecart;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitExplosiveMinecart extends BukkitVehicle<org.bukkit.entity.minecart.ExplosiveMinecart> implements ExplosiveMinecart {
    public BukkitExplosiveMinecart(org.bukkit.entity.minecart.ExplosiveMinecart wrapped) {
        super(wrapped);
    }
}
