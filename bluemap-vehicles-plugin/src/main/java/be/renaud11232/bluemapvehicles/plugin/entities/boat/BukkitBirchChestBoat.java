package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.BirchChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitBirchChestBoat extends BukkitVehicle<org.bukkit.entity.boat.BirchChestBoat> implements BirchChestBoat {
    public BukkitBirchChestBoat(org.bukkit.entity.boat.BirchChestBoat wrapped) {
        super(wrapped);
    }
}
