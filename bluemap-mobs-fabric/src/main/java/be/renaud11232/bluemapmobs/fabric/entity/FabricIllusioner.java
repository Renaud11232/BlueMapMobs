package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Illusioner;

public class FabricIllusioner extends FabricMob<net.minecraft.world.entity.monster.illager.Illusioner> implements Illusioner {
    public FabricIllusioner(net.minecraft.world.entity.monster.illager.Illusioner wrapped) {
        super(wrapped);
    }
}
