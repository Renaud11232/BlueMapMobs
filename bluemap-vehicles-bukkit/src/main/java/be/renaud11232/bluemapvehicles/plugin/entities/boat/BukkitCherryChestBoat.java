package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.CherryChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitCherryChestBoat extends BukkitVehicle<org.bukkit.entity.boat.CherryChestBoat> implements CherryChestBoat {
    public BukkitCherryChestBoat(org.bukkit.entity.boat.CherryChestBoat wrapped) {
        super(wrapped);
    }
}
