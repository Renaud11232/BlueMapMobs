package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Skeleton;

public class FabricSkeleton extends FabricMob<net.minecraft.world.entity.monster.skeleton.Skeleton> implements Skeleton {
    public FabricSkeleton(net.minecraft.world.entity.monster.skeleton.Skeleton wrapped) {
        super(wrapped);
    }
}
