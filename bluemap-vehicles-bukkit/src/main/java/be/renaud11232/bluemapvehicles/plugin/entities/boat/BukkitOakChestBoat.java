package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.OakChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitOakChestBoat extends BukkitVehicle<org.bukkit.entity.boat.OakChestBoat> implements OakChestBoat {
    public BukkitOakChestBoat(org.bukkit.entity.boat.OakChestBoat wrapped) {
        super(wrapped);
    }
}
