package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Blaze;

public class FabricBlaze extends FabricMob<net.minecraft.world.entity.monster.Blaze> implements Blaze {
    public FabricBlaze(net.minecraft.world.entity.monster.Blaze wrapped) {
        super(wrapped);
    }
}
