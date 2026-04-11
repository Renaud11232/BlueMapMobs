package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.DarkOakBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitDarkOakBoat extends BukkitVehicle<org.bukkit.entity.boat.DarkOakBoat> implements DarkOakBoat {
    public BukkitDarkOakBoat(org.bukkit.entity.boat.DarkOakBoat wrapped) {
        super(wrapped);
    }
}
