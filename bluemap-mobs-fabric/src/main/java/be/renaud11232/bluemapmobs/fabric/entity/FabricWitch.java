package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Witch;

public class FabricWitch extends FabricMob<net.minecraft.world.entity.monster.Witch> implements Witch {
    public FabricWitch(net.minecraft.world.entity.monster.Witch wrapped) {
        super(wrapped);
    }
}
