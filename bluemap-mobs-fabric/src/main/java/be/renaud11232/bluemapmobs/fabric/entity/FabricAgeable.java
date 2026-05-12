package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Ageable;
import net.minecraft.world.entity.AgeableMob;

public abstract class FabricAgeable<T extends AgeableMob> extends FabricMob<T> implements Ageable {
    public FabricAgeable(T wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAdult() {
        return !wrapped.isBaby();
    }
}
