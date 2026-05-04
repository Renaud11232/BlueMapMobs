package be.renaud11232.bluemapvehicles.bukkit.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.SpawnerMinecart;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;

public class BukkitSpawnerMinecart extends BukkitVehicle<org.bukkit.entity.minecart.SpawnerMinecart> implements SpawnerMinecart {
    public BukkitSpawnerMinecart(org.bukkit.entity.minecart.SpawnerMinecart wrapped) {
        super(wrapped);
    }
}
