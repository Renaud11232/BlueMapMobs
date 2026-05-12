package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Vex;

public class FabricVex extends FabricMob<net.minecraft.world.entity.monster.Vex> implements Vex {
    public FabricVex(net.minecraft.world.entity.monster.Vex wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isCharging() {
        return wrapped.isCharging();
    }
}
