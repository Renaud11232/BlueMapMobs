package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.JungleBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitJungleBoat extends BukkitVehicle<org.bukkit.entity.boat.JungleBoat> implements JungleBoat {
    public BukkitJungleBoat(org.bukkit.entity.boat.JungleBoat wrapped) {
        super(wrapped);
    }
}
