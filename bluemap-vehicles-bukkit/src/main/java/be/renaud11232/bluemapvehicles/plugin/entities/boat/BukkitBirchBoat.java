package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.BirchBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitBirchBoat extends BukkitVehicle<org.bukkit.entity.boat.BirchBoat> implements BirchBoat {
    public BukkitBirchBoat(org.bukkit.entity.boat.BirchBoat wrapped) {
        super(wrapped);
    }
}
