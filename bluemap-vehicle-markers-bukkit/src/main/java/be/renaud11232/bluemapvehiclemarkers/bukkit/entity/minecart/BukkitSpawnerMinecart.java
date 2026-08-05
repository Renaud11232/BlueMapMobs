package be.renaud11232.bluemapvehiclemarkers.bukkit.entity.minecart;

import be.renaud11232.bluemapvehiclemarkers.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.SpawnerMinecart;

public class BukkitSpawnerMinecart extends BukkitVehicle<org.bukkit.entity.minecart.SpawnerMinecart> implements SpawnerMinecart {
    public BukkitSpawnerMinecart(org.bukkit.entity.minecart.SpawnerMinecart wrapped) {
        super(wrapped);
    }
}
