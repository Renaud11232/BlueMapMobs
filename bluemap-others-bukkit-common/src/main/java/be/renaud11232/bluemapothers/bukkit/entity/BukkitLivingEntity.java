package be.renaud11232.bluemapothers.bukkit.entity;

import be.renaud11232.bluemapentities.Position;
import be.renaud11232.bluemapothers.entity.LivingEntity;
import org.bukkit.Location;

public abstract class BukkitLivingEntity<T extends org.bukkit.entity.LivingEntity> extends BukkitEntity<T> implements LivingEntity {
    public BukkitLivingEntity(T wrapped) {
        super(wrapped);
    }

    @Override
    public Position getPosition() {
        Location location = wrapped.getEyeLocation();
        return new Position(
                location.getX(),
                location.getY(),
                location.getZ()
        );
    }
}
