package be.renaud11232.bluemapvehiclemarkers.bukkit.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.ExplosiveMinecart;

public class BukkitExplosiveMinecart extends BukkitVehicle<org.bukkit.entity.minecart.ExplosiveMinecart> implements ExplosiveMinecart {
    public BukkitExplosiveMinecart(org.bukkit.entity.minecart.ExplosiveMinecart wrapped) {
        super(wrapped);
    }
}
