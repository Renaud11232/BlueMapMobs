package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.OakBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitOakBoat extends BukkitVehicle<org.bukkit.entity.boat.OakBoat> implements OakBoat {
    public BukkitOakBoat(org.bukkit.entity.boat.OakBoat wrapped) {
        super(wrapped);
    }
}
