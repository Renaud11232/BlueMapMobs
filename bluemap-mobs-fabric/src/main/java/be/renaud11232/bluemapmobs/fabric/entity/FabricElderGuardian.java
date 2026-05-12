package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.ElderGuardian;

public class FabricElderGuardian extends FabricMob<net.minecraft.world.entity.monster.ElderGuardian> implements ElderGuardian {
    public FabricElderGuardian(net.minecraft.world.entity.monster.ElderGuardian wrapped) {
        super(wrapped);
    }
}
