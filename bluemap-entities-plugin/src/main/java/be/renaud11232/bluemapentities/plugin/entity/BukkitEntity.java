package be.renaud11232.bluemapentities.plugin.entity;

import be.renaud11232.bluemapentities.Position;
import be.renaud11232.bluemapentities.entity.WrappedEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.UUID;

public abstract class BukkitEntity<T extends Entity> extends WrappedEntity<T> {
    public BukkitEntity(T wrapped) {
        super(wrapped);
    }

    @Override
    public UUID getUUID() {
        return wrapped.getUniqueId();
    }

    @Override
    public String getName() {
        return wrapped.getName();
    }

    @Override
    public Position getPosition() {
        Location location = wrapped.getLocation();
        return new Position(
                location.getX(),
                location.getY(),
                location.getZ()
        );
    }
}
