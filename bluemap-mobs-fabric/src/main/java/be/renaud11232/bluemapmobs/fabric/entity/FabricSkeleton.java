package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Skeleton;

public class FabricSkeleton extends FabricMob<net.minecraft.world.entity.monster.skeleton.Skeleton> implements Skeleton {
    public FabricSkeleton(net.minecraft.world.entity.monster.skeleton.Skeleton wrapped) {
        super(wrapped);
    }
}
