package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.MangroveBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitMangroveBoat extends BukkitVehicle<org.bukkit.entity.boat.MangroveBoat> implements MangroveBoat {
    public BukkitMangroveBoat(org.bukkit.entity.boat.MangroveBoat wrapped) {
        super(wrapped);
    }
}
