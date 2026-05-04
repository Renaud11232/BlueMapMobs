package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.PaleOakChestBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitPaleOakChestBoat extends BukkitVehicle<org.bukkit.entity.boat.PaleOakChestBoat> implements PaleOakChestBoat {
    public BukkitPaleOakChestBoat(org.bukkit.entity.boat.PaleOakChestBoat wrapped) {
        super(wrapped);
    }
}
