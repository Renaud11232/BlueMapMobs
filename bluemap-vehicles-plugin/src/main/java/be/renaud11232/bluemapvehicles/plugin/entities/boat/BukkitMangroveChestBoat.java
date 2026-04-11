package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.MangroveChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitMangroveChestBoat extends BukkitVehicle<org.bukkit.entity.boat.MangroveChestBoat> implements MangroveChestBoat {
    public BukkitMangroveChestBoat(org.bukkit.entity.boat.MangroveChestBoat wrapped) {
        super(wrapped);
    }
}
