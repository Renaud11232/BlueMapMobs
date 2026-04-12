package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.DarkOakBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitDarkOakBoat extends BukkitVehicle<org.bukkit.entity.boat.DarkOakBoat> implements DarkOakBoat {
    public BukkitDarkOakBoat(org.bukkit.entity.boat.DarkOakBoat wrapped) {
        super(wrapped);
    }
}
