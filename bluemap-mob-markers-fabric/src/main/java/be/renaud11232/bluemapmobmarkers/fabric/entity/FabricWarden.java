package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Warden;

public class FabricWarden extends FabricMob<net.minecraft.world.entity.monster.warden.Warden> implements Warden {
    public FabricWarden(net.minecraft.world.entity.monster.warden.Warden wrapped) {
        super(wrapped);
    }
}
