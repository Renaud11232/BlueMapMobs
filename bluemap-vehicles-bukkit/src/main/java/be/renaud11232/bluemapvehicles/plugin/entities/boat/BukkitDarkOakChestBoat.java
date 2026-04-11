package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.DarkOakChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitDarkOakChestBoat extends BukkitVehicle<org.bukkit.entity.boat.DarkOakChestBoat> implements DarkOakChestBoat {
    public BukkitDarkOakChestBoat(org.bukkit.entity.boat.DarkOakChestBoat wrapped) {
        super(wrapped);
    }
}
