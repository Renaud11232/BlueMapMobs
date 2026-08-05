package be.renaud11232.bluemapothermarkers.spigot.entity;

import be.renaud11232.bluemapothermarkers.bukkit.entity.BukkitLivingEntity;
import be.renaud11232.bluemapothermarkers.entity.Mannequin;

public class SpigotMannequin extends BukkitLivingEntity<org.bukkit.entity.Mannequin> implements Mannequin {
    public SpigotMannequin(org.bukkit.entity.Mannequin wrapped) {
        super(wrapped);
    }
}
