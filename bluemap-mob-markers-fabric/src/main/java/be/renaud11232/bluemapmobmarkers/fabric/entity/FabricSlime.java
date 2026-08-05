package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Slime;

public class FabricSlime extends FabricMob<net.minecraft.world.entity.monster.cubemob.Slime> implements Slime {
    public FabricSlime(net.minecraft.world.entity.monster.cubemob.Slime wrapped) {
        super(wrapped);
    }
}
