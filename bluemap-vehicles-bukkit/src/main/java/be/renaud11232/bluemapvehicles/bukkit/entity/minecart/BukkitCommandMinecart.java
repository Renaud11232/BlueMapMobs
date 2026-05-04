package be.renaud11232.bluemapvehicles.bukkit.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.CommandMinecart;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitCommandMinecart extends BukkitVehicle<org.bukkit.entity.minecart.CommandMinecart> implements CommandMinecart {
    public BukkitCommandMinecart(org.bukkit.entity.minecart.CommandMinecart wrapped) {
        super(wrapped);
    }
}
