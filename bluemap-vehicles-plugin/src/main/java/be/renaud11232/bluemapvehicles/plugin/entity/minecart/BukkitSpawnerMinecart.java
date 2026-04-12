package be.renaud11232.bluemapvehicles.plugin.entity.minecart;

import be.renaud11232.bluemapvehicles.entity.minecart.SpawnerMinecart;
import be.renaud11232.bluemapvehicles.plugin.entity.BukkitVehicle;

public class BukkitSpawnerMinecart extends BukkitVehicle<org.bukkit.entity.minecart.SpawnerMinecart> implements SpawnerMinecart {
    public BukkitSpawnerMinecart(org.bukkit.entity.minecart.SpawnerMinecart wrapped) {
        super(wrapped);
    }
}
