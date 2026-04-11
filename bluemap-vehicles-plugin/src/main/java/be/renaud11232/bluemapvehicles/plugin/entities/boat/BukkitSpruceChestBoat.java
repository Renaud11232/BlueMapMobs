package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.SpruceChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitSpruceChestBoat extends BukkitVehicle<org.bukkit.entity.boat.SpruceChestBoat> implements SpruceChestBoat {
    public BukkitSpruceChestBoat(org.bukkit.entity.boat.SpruceChestBoat wrapped) {
        super(wrapped);
    }
}
