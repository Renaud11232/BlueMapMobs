package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.SulfurCube;

public class FabricSulfurCube extends FabricMob<net.minecraft.world.entity.monster.cubemob.SulfurCube> implements SulfurCube {
    public FabricSulfurCube(net.minecraft.world.entity.monster.cubemob.SulfurCube wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return wrapped.getSize() > 1;
    }
}
