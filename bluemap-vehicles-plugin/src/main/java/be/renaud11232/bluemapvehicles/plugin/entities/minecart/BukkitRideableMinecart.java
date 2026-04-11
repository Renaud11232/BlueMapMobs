package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.minecart.RideableMinecart;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitRideableMinecart extends BukkitVehicle<org.bukkit.entity.minecart.RideableMinecart> implements RideableMinecart {
    public BukkitRideableMinecart(org.bukkit.entity.minecart.RideableMinecart wrapped) {
        super(wrapped);
    }
}
