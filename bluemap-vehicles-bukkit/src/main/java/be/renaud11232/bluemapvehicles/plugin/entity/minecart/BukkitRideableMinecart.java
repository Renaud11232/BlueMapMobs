package be.renaud11232.bluemapvehicles.plugin.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.RideableMinecart;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitRideableMinecart extends BukkitVehicle<org.bukkit.entity.minecart.RideableMinecart> implements RideableMinecart {
    public BukkitRideableMinecart(org.bukkit.entity.minecart.RideableMinecart wrapped) {
        super(wrapped);
    }
}
