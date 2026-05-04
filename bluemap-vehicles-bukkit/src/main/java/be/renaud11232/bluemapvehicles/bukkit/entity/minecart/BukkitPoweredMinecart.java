package be.renaud11232.bluemapvehicles.bukkit.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.PoweredMinecart;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitPoweredMinecart extends BukkitVehicle<org.bukkit.entity.minecart.PoweredMinecart> implements PoweredMinecart {
    public BukkitPoweredMinecart(org.bukkit.entity.minecart.PoweredMinecart wrapped) {
        super(wrapped);
    }
}
