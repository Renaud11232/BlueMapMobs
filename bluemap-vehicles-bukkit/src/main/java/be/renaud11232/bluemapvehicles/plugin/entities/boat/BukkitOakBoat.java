package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.OakBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitOakBoat extends BukkitVehicle<org.bukkit.entity.boat.OakBoat> implements OakBoat {
    public BukkitOakBoat(org.bukkit.entity.boat.OakBoat wrapped) {
        super(wrapped);
    }
}
