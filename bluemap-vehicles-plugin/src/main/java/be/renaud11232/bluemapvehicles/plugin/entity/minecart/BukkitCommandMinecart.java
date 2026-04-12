package be.renaud11232.bluemapvehicles.plugin.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.CommandMinecart;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitCommandMinecart extends BukkitVehicle<org.bukkit.entity.minecart.CommandMinecart> implements CommandMinecart {
    public BukkitCommandMinecart(org.bukkit.entity.minecart.CommandMinecart wrapped) {
        super(wrapped);
    }
}
