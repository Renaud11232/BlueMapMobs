package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.BirchChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitBirchChestBoat extends BukkitVehicle<org.bukkit.entity.boat.BirchChestBoat> implements BirchChestBoat {
    public BukkitBirchChestBoat(org.bukkit.entity.boat.BirchChestBoat wrapped) {
        super(wrapped);
    }
}
