package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Guardian;

public class FabricGuardian extends FabricMob<net.minecraft.world.entity.monster.Guardian> implements Guardian {
    public FabricGuardian(net.minecraft.world.entity.monster.Guardian wrapped) {
        super(wrapped);
    }
}
