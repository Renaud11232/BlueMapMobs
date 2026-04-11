package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapvehicles.entities.minecart.SpawnerMinecart;
import be.renaud11232.bluemapvehicles.plugin.entities.BukkitVehicle;

public class BukkitSpawnerMinecart extends BukkitVehicle<org.bukkit.entity.minecart.SpawnerMinecart> implements SpawnerMinecart {
    public BukkitSpawnerMinecart(org.bukkit.entity.minecart.SpawnerMinecart wrapped) {
        super(wrapped);
    }
}
