package be.renaud11232.bluemapvehicles.bukkit.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.RideableMinecart;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitRideableMinecart extends BukkitVehicle<org.bukkit.entity.minecart.RideableMinecart> implements RideableMinecart {
    public BukkitRideableMinecart(org.bukkit.entity.minecart.RideableMinecart wrapped) {
        super(wrapped);
    }
}
