package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.minecart.PoweredMinecart;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitPoweredMinecart extends BukkitVehicle<org.bukkit.entity.minecart.PoweredMinecart> implements PoweredMinecart {
    public BukkitPoweredMinecart(org.bukkit.entity.minecart.PoweredMinecart wrapped) {
        super(wrapped);
    }
}
