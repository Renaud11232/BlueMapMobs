package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Ravager;

public class FabricRavager extends FabricMob<net.minecraft.world.entity.monster.Ravager> implements Ravager {
    public FabricRavager(net.minecraft.world.entity.monster.Ravager wrapped) {
        super(wrapped);
    }
}
