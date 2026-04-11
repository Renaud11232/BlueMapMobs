package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.PaleOakBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitPaleOakBoat extends BukkitVehicle<org.bukkit.entity.boat.PaleOakBoat> implements PaleOakBoat {
    public BukkitPaleOakBoat(org.bukkit.entity.boat.PaleOakBoat wrapped) {
        super(wrapped);
    }
}
