package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapentities.fabric.entity.FabricEntity;
import be.renaud11232.bluemapmobs.entity.Mob;

public abstract class FabricMob<T extends net.minecraft.world.entity.Mob> extends FabricEntity<T> implements Mob {
    public FabricMob(T wrapped) {
        super(wrapped);
    }
}
