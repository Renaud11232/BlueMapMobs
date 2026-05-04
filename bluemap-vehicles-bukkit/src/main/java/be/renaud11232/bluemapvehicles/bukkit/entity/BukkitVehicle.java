package be.renaud11232.bluemapvehicles.bukkit.entity;

import be.renaud11232.bluemapentities.Position;
import be.renaud11232.bluemapentities.Wrapper;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import org.bukkit.Location;

import java.util.UUID;

public abstract class BukkitVehicle<T extends org.bukkit.entity.Vehicle> extends Wrapper<T> implements Vehicle {
    public BukkitVehicle(T wrapped) {
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
