package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.CherryBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitCherryBoat extends BukkitVehicle<org.bukkit.entity.boat.CherryBoat> implements CherryBoat {
    public BukkitCherryBoat(org.bukkit.entity.boat.CherryBoat wrapped) {
        super(wrapped);
    }
}
