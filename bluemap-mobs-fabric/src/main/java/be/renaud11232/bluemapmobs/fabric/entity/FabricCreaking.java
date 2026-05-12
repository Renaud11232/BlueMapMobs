package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Creaking;

public class FabricCreaking extends FabricMob<net.minecraft.world.entity.monster.creaking.Creaking> implements Creaking {
    public FabricCreaking(net.minecraft.world.entity.monster.creaking.Creaking wrapped) {
        super(wrapped);
    }
}
