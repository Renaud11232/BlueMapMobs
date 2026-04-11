package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.MangroveBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitMangroveBoat extends BukkitVehicle<org.bukkit.entity.boat.MangroveBoat> implements MangroveBoat {
    public BukkitMangroveBoat(org.bukkit.entity.boat.MangroveBoat wrapped) {
        super(wrapped);
    }
}
