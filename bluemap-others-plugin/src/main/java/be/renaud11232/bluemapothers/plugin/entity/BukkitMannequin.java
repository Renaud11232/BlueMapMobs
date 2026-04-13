package be.renaud11232.bluemapothers.plugin.entity;

import be.renaud11232.bluemapothers.entity.Mannequin;

public class BukkitMannequin extends BukkitEntity<org.bukkit.entity.Mannequin> implements Mannequin {
    public BukkitMannequin(org.bukkit.entity.Mannequin wrapped) {
        super(wrapped);
    }
}
