package be.renaud11232.bluemapothermarkers.fabric.entity;

import be.renaud11232.bluemapentitymarkers.Position;
import be.renaud11232.bluemapentitymarkers.fabric.entity.FabricEntity;
import be.renaud11232.bluemapothermarkers.entity.LivingEntity;

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
