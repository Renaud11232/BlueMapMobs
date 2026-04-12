package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.MangroveChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitMangroveChestBoat extends BukkitVehicle<org.bukkit.entity.boat.MangroveChestBoat> implements MangroveChestBoat {
    public BukkitMangroveChestBoat(org.bukkit.entity.boat.MangroveChestBoat wrapped) {
        super(wrapped);
    }
}
