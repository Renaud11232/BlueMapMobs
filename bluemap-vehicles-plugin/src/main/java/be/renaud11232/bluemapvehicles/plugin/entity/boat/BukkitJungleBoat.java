package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.JungleBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitJungleBoat extends BukkitVehicle<org.bukkit.entity.boat.JungleBoat> implements JungleBoat {
    public BukkitJungleBoat(org.bukkit.entity.boat.JungleBoat wrapped) {
        super(wrapped);
    }
}
