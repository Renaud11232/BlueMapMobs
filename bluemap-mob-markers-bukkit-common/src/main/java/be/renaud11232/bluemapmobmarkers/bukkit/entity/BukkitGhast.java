package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Ghast;

public class BukkitGhast extends BukkitMob<org.bukkit.entity.Ghast> implements Ghast {
    public BukkitGhast(org.bukkit.entity.Ghast wrapped) {
        super(wrapped);
    }
}
