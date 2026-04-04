package be.renaud11232.bluemapvehicles.plugin.entities.minecart;

import be.renaud11232.bluemapentities.plugin.entity.BukkitEntity;
import be.renaud11232.bluemapvehicles.entities.minecart.SpawnerMinecart;

public class BukkitSpawnerMinecart extends BukkitEntity<org.bukkit.entity.minecart.SpawnerMinecart> implements SpawnerMinecart {
    public BukkitSpawnerMinecart(org.bukkit.entity.minecart.SpawnerMinecart wrapped) {
        super(wrapped);
    }
}
