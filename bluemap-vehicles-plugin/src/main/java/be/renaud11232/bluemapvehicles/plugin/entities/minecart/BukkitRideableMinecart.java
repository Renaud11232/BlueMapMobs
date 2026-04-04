package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.minecart.RideableMinecart;

public class BukkitRideableMinecart extends BukkitEntity<org.bukkit.entity.minecart.RideableMinecart> implements RideableMinecart {
    public BukkitRideableMinecart(org.bukkit.entity.minecart.RideableMinecart wrapped) {
        super(wrapped);
    }
}
