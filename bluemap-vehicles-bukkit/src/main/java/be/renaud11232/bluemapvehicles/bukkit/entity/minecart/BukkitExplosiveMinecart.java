package be.renaud11232.bluemapvehicles.bukkit.entity.minecart;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.minecart.ExplosiveMinecart;

public class BukkitExplosiveMinecart extends BukkitVehicle<org.bukkit.entity.minecart.ExplosiveMinecart> implements ExplosiveMinecart {
    public BukkitExplosiveMinecart(org.bukkit.entity.minecart.ExplosiveMinecart wrapped) {
        super(wrapped);
    }
}
