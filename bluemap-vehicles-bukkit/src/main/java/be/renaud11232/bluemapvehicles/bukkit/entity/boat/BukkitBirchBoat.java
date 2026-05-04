package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.BirchBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitBirchBoat extends BukkitVehicle<org.bukkit.entity.boat.BirchBoat> implements BirchBoat {
    public BukkitBirchBoat(org.bukkit.entity.boat.BirchBoat wrapped) {
        super(wrapped);
    }
}
