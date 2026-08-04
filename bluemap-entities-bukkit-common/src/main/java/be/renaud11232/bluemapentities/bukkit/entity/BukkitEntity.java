package be.renaud11232.bluemapentities.bukkit.entity;

import be.renaud11232.bluemapentities.Position;
import be.renaud11232.bluemapentities.Wrapper;
import be.renaud11232.bluemapentities.entity.Entity;
import org.bukkit.Location;

import java.util.UUID;

public abstract class BukkitEntity<T extends org.bukkit.entity.Entity> extends Wrapper<T> implements Entity {
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

    @Override
    public int getBlockLightLevel() {
        return wrapped.getLocation().getBlock().getLightFromBlocks();
    }

    @Override
    public int getSkyLightLevel() {
        return wrapped.getLocation().getBlock().getLightFromSky();
    }
}
