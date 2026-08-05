package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.WitherSkeleton;

public class BukkitWitherSkeleton extends BukkitMob<org.bukkit.entity.WitherSkeleton> implements WitherSkeleton {
    public BukkitWitherSkeleton(org.bukkit.entity.WitherSkeleton wrapped) {
        super(wrapped);
    }
}
