package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.SpruceChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitSpruceChestBoat extends BukkitVehicle<org.bukkit.entity.boat.SpruceChestBoat> implements SpruceChestBoat {
    public BukkitSpruceChestBoat(org.bukkit.entity.boat.SpruceChestBoat wrapped) {
        super(wrapped);
    }
}
