package be.renaud11232.bluemapothers.plugin.spigot.entity;

import be.renaud11232.bluemapothers.entity.Mannequin;
import be.renaud11232.bluemapothers.common.entity.BukkitEntity;

public class SpigotMannequin extends BukkitEntity<org.bukkit.entity.Mannequin> implements Mannequin {
    public SpigotMannequin(org.bukkit.entity.Mannequin wrapped) {
        super(wrapped);
    }
}
