package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Allay;

public class FabricAllay extends FabricMob<net.minecraft.world.entity.animal.allay.Allay> implements Allay {
    public FabricAllay(net.minecraft.world.entity.animal.allay.Allay wrapped) {
        super(wrapped);
    }
}
