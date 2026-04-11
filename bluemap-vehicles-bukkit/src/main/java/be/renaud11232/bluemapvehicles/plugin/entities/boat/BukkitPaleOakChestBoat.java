package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.PaleOakChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitPaleOakChestBoat extends BukkitVehicle<org.bukkit.entity.boat.PaleOakChestBoat> implements PaleOakChestBoat {
    public BukkitPaleOakChestBoat(org.bukkit.entity.boat.PaleOakChestBoat wrapped) {
        super(wrapped);
    }
}
