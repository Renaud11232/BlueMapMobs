package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapentitymarkers.fabric.entity.FabricEntity;
import be.renaud11232.bluemapmobmarkers.entity.Mob;

public abstract class FabricMob<T extends net.minecraft.world.entity.Mob> extends FabricEntity<T> implements Mob {
    public FabricMob(T wrapped) {
        super(wrapped);
    }
}
