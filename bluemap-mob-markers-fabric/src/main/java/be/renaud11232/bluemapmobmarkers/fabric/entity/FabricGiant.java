package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Giant;

public class FabricGiant extends FabricMob<net.minecraft.world.entity.monster.Giant> implements Giant {
    public FabricGiant(net.minecraft.world.entity.monster.Giant wrapped) {
        super(wrapped);
    }
}
