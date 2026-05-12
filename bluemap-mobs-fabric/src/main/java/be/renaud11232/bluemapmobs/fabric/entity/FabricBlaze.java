package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Blaze;

public class FabricBlaze extends FabricMob<net.minecraft.world.entity.monster.Blaze> implements Blaze {
    public FabricBlaze(net.minecraft.world.entity.monster.Blaze wrapped) {
        super(wrapped);
    }
}
