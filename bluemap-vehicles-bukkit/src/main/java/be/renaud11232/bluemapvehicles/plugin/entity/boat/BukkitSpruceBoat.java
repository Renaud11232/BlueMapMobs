package be.renaud11232.bluemapvehicles.plugin.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.SpruceBoat;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitSpruceBoat extends BukkitVehicle<org.bukkit.entity.boat.SpruceBoat> implements SpruceBoat {
    public BukkitSpruceBoat(org.bukkit.entity.boat.SpruceBoat wrapped) {
        super(wrapped);
    }
}
