package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.minecart.HopperMinecart;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitHopperMinecart extends BukkitVehicle<org.bukkit.entity.minecart.HopperMinecart> implements HopperMinecart {
    public BukkitHopperMinecart(org.bukkit.entity.minecart.HopperMinecart wrapped) {
        super(wrapped);
    }
}
