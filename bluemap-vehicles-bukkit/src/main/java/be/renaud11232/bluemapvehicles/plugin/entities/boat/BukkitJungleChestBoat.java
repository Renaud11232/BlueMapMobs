package be.renaud11232.bluemapvehicles.plugin.entities.boat;

import be.renaud11232.bluemapvehicles.entities.boat.JungleChestBoat;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitJungleChestBoat extends BukkitVehicle<org.bukkit.entity.boat.JungleChestBoat> implements JungleChestBoat {
    public BukkitJungleChestBoat(org.bukkit.entity.boat.JungleChestBoat wrapped) {
        super(wrapped);
    }
}
