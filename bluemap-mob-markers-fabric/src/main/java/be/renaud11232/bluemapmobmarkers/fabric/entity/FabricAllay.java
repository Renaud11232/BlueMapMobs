package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Allay;

public class FabricAllay extends FabricMob<net.minecraft.world.entity.animal.allay.Allay> implements Allay {
    public FabricAllay(net.minecraft.world.entity.animal.allay.Allay wrapped) {
        super(wrapped);
    }
}
