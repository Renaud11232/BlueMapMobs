package be.renaud11232.bluemapvehicles.plugin;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapvehicles.VehicleModule;
import org.bukkit.World;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Vehicle;

import java.util.Collection;

import static java.util.function.Predicate.not;

public class BukkitVehiclesModule extends VehicleModule<Vehicle> {

    public BukkitVehiclesModule(BlueMapEntitiesAPI api) {
        super(api, new BukkitVehicleConverter());
    }

    @Override
    protected Collection<Vehicle> getNativeEntities(Object world) {
        return ((World) world).getEntitiesByClass(Vehicle.class)
                .stream()
                .filter(not(vehicle -> vehicle instanceof Mob))
                .toList();
    }
}
