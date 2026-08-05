package be.renaud11232.bluemapvehiclemarkers.bukkit.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.CommandMinecart;

public class BukkitCommandMinecart extends BukkitVehicle<org.bukkit.entity.minecart.CommandMinecart> implements CommandMinecart {
    public BukkitCommandMinecart(org.bukkit.entity.minecart.CommandMinecart wrapped) {
        super(wrapped);
    }
}
