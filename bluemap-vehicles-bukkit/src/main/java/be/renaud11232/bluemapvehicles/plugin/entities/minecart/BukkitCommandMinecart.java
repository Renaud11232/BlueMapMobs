package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.minecart.CommandMinecart;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitCommandMinecart extends BukkitVehicle<org.bukkit.entity.minecart.CommandMinecart> implements CommandMinecart {
    public BukkitCommandMinecart(org.bukkit.entity.minecart.CommandMinecart wrapped) {
        super(wrapped);
    }
}
