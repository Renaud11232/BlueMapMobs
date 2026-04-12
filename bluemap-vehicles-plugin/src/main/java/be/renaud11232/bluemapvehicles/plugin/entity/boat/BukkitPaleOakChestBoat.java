package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.PaleOakChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitPaleOakChestBoat extends BukkitVehicle<org.bukkit.entity.boat.PaleOakChestBoat> implements PaleOakChestBoat {
    public BukkitPaleOakChestBoat(org.bukkit.entity.boat.PaleOakChestBoat wrapped) {
        super(wrapped);
    }
}
