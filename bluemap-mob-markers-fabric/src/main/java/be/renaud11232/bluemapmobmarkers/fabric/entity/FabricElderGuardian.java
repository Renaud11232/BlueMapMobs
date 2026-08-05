package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.ElderGuardian;

public class FabricElderGuardian extends FabricMob<net.minecraft.world.entity.monster.ElderGuardian> implements ElderGuardian {
    public FabricElderGuardian(net.minecraft.world.entity.monster.ElderGuardian wrapped) {
        super(wrapped);
    }
}
