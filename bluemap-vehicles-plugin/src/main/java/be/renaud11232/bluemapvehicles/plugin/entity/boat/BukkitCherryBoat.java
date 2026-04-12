package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.CherryBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitCherryBoat extends BukkitVehicle<org.bukkit.entity.boat.CherryBoat> implements CherryBoat {
    public BukkitCherryBoat(org.bukkit.entity.boat.CherryBoat wrapped) {
        super(wrapped);
    }
}
