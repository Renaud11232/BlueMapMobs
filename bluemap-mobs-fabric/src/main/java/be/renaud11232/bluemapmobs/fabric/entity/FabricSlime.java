package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Slime;

public class FabricSlime extends FabricMob<net.minecraft.world.entity.monster.cubemob.Slime> implements Slime {
    public FabricSlime(net.minecraft.world.entity.monster.cubemob.Slime wrapped) {
        super(wrapped);
    }
}
