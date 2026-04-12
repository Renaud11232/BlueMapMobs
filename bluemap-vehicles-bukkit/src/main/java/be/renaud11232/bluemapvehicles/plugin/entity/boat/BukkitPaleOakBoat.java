package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.PaleOakBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitPaleOakBoat extends BukkitVehicle<org.bukkit.entity.boat.PaleOakBoat> implements PaleOakBoat {
    public BukkitPaleOakBoat(org.bukkit.entity.boat.PaleOakBoat wrapped) {
        super(wrapped);
    }
}
