package be.renaud11232.bluemapvehiclemarkers.bukkit;

import be.renaud11232.bluemapentitymarkers.bukkit.module.BukkitModule;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapvehiclemarkers.VehiclesModule;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Vehicle;

import java.util.Collection;

import static java.util.function.Predicate.not;

public class BukkitVehiclesModule extends VehiclesModule<World, Vehicle> implements BukkitModule<Vehicle> {

    public BukkitVehiclesModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new BukkitVehicleConverter());
    }

    @Override
    public Collection<? extends Vehicle> getEntities(World world) {
        return world.getEntitiesByClass(Vehicle.class)
                .stream()
                .filter(not(vehicle -> vehicle instanceof Mob))
                .toList();
    }
}
