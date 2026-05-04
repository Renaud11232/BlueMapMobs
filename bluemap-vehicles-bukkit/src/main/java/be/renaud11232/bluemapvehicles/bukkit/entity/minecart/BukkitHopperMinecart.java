package be.renaud11232.bluemapvehicles.bukkit.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.HopperMinecart;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitHopperMinecart extends BukkitVehicle<org.bukkit.entity.minecart.HopperMinecart> implements HopperMinecart {
    public BukkitHopperMinecart(org.bukkit.entity.minecart.HopperMinecart wrapped) {
        super(wrapped);
    }
}
