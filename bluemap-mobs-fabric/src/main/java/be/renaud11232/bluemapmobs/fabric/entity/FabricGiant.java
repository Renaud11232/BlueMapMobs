package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Giant;

public class FabricGiant extends FabricMob<net.minecraft.world.entity.monster.Giant> implements Giant {
    public FabricGiant(net.minecraft.world.entity.monster.Giant wrapped) {
        super(wrapped);
    }
}
