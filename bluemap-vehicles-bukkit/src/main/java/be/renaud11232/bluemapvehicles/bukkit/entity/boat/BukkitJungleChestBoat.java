package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.JungleChestBoat;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitJungleChestBoat extends BukkitVehicle<org.bukkit.entity.boat.JungleChestBoat> implements JungleChestBoat {
    public BukkitJungleChestBoat(org.bukkit.entity.boat.JungleChestBoat wrapped) {
        super(wrapped);
    }
}
