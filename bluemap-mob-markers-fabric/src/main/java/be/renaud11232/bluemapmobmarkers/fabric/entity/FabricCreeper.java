package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Creeper;

public class FabricCreeper extends FabricMob<net.minecraft.world.entity.monster.Creeper> implements Creeper {
    public FabricCreeper(net.minecraft.world.entity.monster.Creeper wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isPowered() {
        return wrapped.isPowered();
    }
}
