package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.SpruceBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitSpruceBoat extends BukkitVehicle<org.bukkit.entity.boat.SpruceBoat> implements SpruceBoat {
    public BukkitSpruceBoat(org.bukkit.entity.boat.SpruceBoat wrapped) {
        super(wrapped);
    }
}
