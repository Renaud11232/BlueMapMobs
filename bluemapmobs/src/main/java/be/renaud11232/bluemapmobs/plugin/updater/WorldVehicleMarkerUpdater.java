package be.renaud11232.bluemapmobs.plugin.updater;

import be.renaud11232.bluemapmobs.plugin.BlueMapMobs;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.VehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markersetbuilder.VehicleMarkerSetBuilder;
import be.renaud11232.bluemapmobs.updater.AbstractWorldEntityMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Vehicle;

import java.util.Collection;

import static java.util.function.Predicate.not;

public class WorldVehicleMarkerUpdater extends AbstractWorldEntityMarkerUpdater<Vehicle> {
    public WorldVehicleMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new VehicleMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new VehicleMarkerBuilder(api, plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public Collection<Vehicle> getElements(World world) {
        return world.getEntitiesByClass(Vehicle.class)
                .stream()
                .filter(not(vehicle -> vehicle instanceof Mob))
                .toList();
    }
}
