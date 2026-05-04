package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.OakBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitOakBoat extends BukkitVehicle<org.bukkit.entity.boat.OakBoat> implements OakBoat {
    public BukkitOakBoat(org.bukkit.entity.boat.OakBoat wrapped) {
        super(wrapped);
    }
}
