package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Snowman;
import net.minecraft.world.entity.animal.golem.SnowGolem;

public class FabricSnowman extends FabricMob<SnowGolem> implements Snowman {
    public FabricSnowman(SnowGolem wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isDerp() {
        return !wrapped.hasPumpkin();
    }
}
