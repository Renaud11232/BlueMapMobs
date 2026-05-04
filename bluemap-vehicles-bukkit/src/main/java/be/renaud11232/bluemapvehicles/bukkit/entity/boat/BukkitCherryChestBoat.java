package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.CherryChestBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitCherryChestBoat extends BukkitVehicle<org.bukkit.entity.boat.CherryChestBoat> implements CherryChestBoat {
    public BukkitCherryChestBoat(org.bukkit.entity.boat.CherryChestBoat wrapped) {
        super(wrapped);
    }
}
