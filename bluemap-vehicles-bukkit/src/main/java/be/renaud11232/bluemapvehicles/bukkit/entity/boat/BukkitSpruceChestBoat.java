package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.SpruceChestBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitSpruceChestBoat extends BukkitVehicle<org.bukkit.entity.boat.SpruceChestBoat> implements SpruceChestBoat {
    public BukkitSpruceChestBoat(org.bukkit.entity.boat.SpruceChestBoat wrapped) {
        super(wrapped);
    }
}
