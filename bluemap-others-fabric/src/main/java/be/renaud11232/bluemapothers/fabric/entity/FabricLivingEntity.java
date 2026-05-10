package be.renaud11232.bluemapothers.fabric.entity;

import be.renaud11232.bluemapentities.Position;
import be.renaud11232.bluemapothers.entity.LivingEntity;

public abstract class FabricLivingEntity<T extends net.minecraft.world.entity.LivingEntity> extends FabricEntity<T> implements LivingEntity {
    public FabricLivingEntity(T wrapped) {
        super(wrapped);
    }

    @Override
    public Position getPosition() {
        var position = wrapped.getEyePosition();
        return new Position(
                position.x(),
                position.y(),
                position.z()
        );
    }
}
