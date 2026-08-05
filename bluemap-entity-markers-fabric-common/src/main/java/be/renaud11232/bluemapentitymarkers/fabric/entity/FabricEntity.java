package be.renaud11232.bluemapentitymarkers.fabric.entity;

import be.renaud11232.bluemapentitymarkers.Position;
import be.renaud11232.bluemapentitymarkers.Wrapper;
import be.renaud11232.bluemapentitymarkers.entity.Entity;
import net.minecraft.world.level.LightLayer;

import java.util.UUID;

public abstract class FabricEntity<T extends net.minecraft.world.entity.Entity> extends Wrapper<T> implements Entity {
    public FabricEntity(T wrapped) {
        super(wrapped);
    }

    @Override
    public UUID getUUID() {
        return wrapped.getUUID();
    }

    @Override
    public String getName() {
        return wrapped.getName().getString();
    }

    @Override
    public Position getPosition() {
        var position = wrapped.position();
        return new Position(
                position.x(),
                position.y(),
                position.z()
        );
    }

    @Override
    public int getBlockLightLevel() {
        return wrapped.level().getBrightness(LightLayer.BLOCK, wrapped.blockPosition());
    }

    @Override
    public int getSkyLightLevel() {
        return wrapped.level().getBrightness(LightLayer.SKY, wrapped.blockPosition());
    }
}
