package be.renaud11232.bluemapothers.spigot.entity;

import be.renaud11232.bluemapothers.bukkit.entity.BukkitLivingEntity;
import be.renaud11232.bluemapothers.entity.Mannequin;

public class SpigotMannequin extends BukkitLivingEntity<org.bukkit.entity.Mannequin> implements Mannequin {
    public SpigotMannequin(org.bukkit.entity.Mannequin wrapped) {
        super(wrapped);
    }
}
