package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Skeleton;

public class BukkitSkeleton extends BukkitMob<org.bukkit.entity.Skeleton> implements Skeleton {
    public BukkitSkeleton(org.bukkit.entity.Skeleton wrapped) {
        super(wrapped);
    }
}
