package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.DarkOakChestBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitDarkOakChestBoat extends BukkitVehicle<org.bukkit.entity.boat.DarkOakChestBoat> implements DarkOakChestBoat {
    public BukkitDarkOakChestBoat(org.bukkit.entity.boat.DarkOakChestBoat wrapped) {
        super(wrapped);
    }
}
