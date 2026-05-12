package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.IronGolem;

public class FabricIronGolem extends FabricMob<net.minecraft.world.entity.animal.golem.IronGolem> implements IronGolem {
    public FabricIronGolem(net.minecraft.world.entity.animal.golem.IronGolem wrapped) {
        super(wrapped);
    }
}
