package be.renaud11232.bluemapvehicles.plugin.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.PoweredMinecart;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitPoweredMinecart extends BukkitVehicle<org.bukkit.entity.minecart.PoweredMinecart> implements PoweredMinecart {
    public BukkitPoweredMinecart(org.bukkit.entity.minecart.PoweredMinecart wrapped) {
        super(wrapped);
    }
}
