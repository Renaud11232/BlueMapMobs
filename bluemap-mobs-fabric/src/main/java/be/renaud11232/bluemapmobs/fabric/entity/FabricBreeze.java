package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Breeze;

public class FabricBreeze extends FabricMob<net.minecraft.world.entity.monster.breeze.Breeze> implements Breeze {
    public FabricBreeze(net.minecraft.world.entity.monster.breeze.Breeze wrapped) {
        super(wrapped);
    }
}
