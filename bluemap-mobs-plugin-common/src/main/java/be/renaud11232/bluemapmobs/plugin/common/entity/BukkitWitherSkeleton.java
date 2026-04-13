package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.WitherSkeleton;

public class BukkitWitherSkeleton extends BukkitMob<org.bukkit.entity.WitherSkeleton> implements WitherSkeleton {
    public BukkitWitherSkeleton(org.bukkit.entity.WitherSkeleton wrapped) {
        super(wrapped);
    }
}
