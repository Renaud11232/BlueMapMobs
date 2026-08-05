package be.renaud11232.bluemapvehiclemarkers.bukkit.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.RideableMinecart;

public class BukkitRideableMinecart extends BukkitVehicle<org.bukkit.entity.minecart.RideableMinecart> implements RideableMinecart {
    public BukkitRideableMinecart(org.bukkit.entity.minecart.RideableMinecart wrapped) {
        super(wrapped);
    }
}
