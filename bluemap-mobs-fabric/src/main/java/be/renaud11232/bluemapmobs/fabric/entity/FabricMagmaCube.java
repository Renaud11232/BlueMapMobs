package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.MagmaCube;

public class FabricMagmaCube extends FabricMob<net.minecraft.world.entity.monster.cubemob.MagmaCube> implements MagmaCube {
    public FabricMagmaCube(net.minecraft.world.entity.monster.cubemob.MagmaCube wrapped) {
        super(wrapped);
    }
}
