package be.renaud11232.bluemapvehicles.bukkit;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapvehicles.VehiclesModule;
import org.bukkit.World;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Vehicle;

import java.util.Collection;

import static java.util.function.Predicate.not;

public class BukkitVehiclesModule extends VehiclesModule<World, Vehicle> {

    public BukkitVehiclesModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, World.class, new BukkitVehicleConverter());
    }

    @Override
    protected Collection<? extends Vehicle> getEntities(World world) {
        return world.getEntitiesByClass(Vehicle.class)
                .stream()
                .filter(not(vehicle -> vehicle instanceof Mob))
                .toList();
    }
}
