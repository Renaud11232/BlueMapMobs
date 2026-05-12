package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Phantom;

public class FabricPhantom extends FabricMob<net.minecraft.world.entity.monster.Phantom> implements Phantom {
    public FabricPhantom(net.minecraft.world.entity.monster.Phantom wrapped) {
        super(wrapped);
    }
}
