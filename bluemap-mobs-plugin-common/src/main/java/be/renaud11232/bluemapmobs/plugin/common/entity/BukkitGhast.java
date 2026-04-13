package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Ghast;

public class BukkitGhast extends BukkitMob<org.bukkit.entity.Ghast> implements Ghast {
    public BukkitGhast(org.bukkit.entity.Ghast wrapped) {
        super(wrapped);
    }
}
