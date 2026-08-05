package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Skeleton;

public class BukkitSkeleton extends BukkitMob<org.bukkit.entity.Skeleton> implements Skeleton {
    public BukkitSkeleton(org.bukkit.entity.Skeleton wrapped) {
        super(wrapped);
    }
}
