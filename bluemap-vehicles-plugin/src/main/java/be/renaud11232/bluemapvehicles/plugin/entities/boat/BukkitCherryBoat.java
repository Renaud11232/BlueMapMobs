package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.CherryBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitCherryBoat extends BukkitVehicle<org.bukkit.entity.boat.CherryBoat> implements CherryBoat {
    public BukkitCherryBoat(org.bukkit.entity.boat.CherryBoat wrapped) {
        super(wrapped);
    }
}
