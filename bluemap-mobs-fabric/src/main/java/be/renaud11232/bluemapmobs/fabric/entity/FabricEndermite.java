package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Endermite;

public class FabricEndermite extends FabricMob<net.minecraft.world.entity.monster.Endermite> implements Endermite {
    public FabricEndermite(net.minecraft.world.entity.monster.Endermite wrapped) {
        super(wrapped);
    }
}
