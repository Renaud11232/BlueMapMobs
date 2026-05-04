package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.OakChestBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitOakChestBoat extends BukkitVehicle<org.bukkit.entity.boat.OakChestBoat> implements OakChestBoat {
    public BukkitOakChestBoat(org.bukkit.entity.boat.OakChestBoat wrapped) {
        super(wrapped);
    }
}
