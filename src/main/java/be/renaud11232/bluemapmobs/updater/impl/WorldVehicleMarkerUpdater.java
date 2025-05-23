package be.renaud11232.bluemapmobs.updater.impl;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.impl.VehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.impl.VehicleMarkerSetBuilder;
import be.renaud11232.bluemapmobs.updater.AbstractWorldEntityMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Vehicle;

import java.util.Collection;

public class WorldVehicleMarkerUpdater extends AbstractWorldEntityMarkerUpdater<Vehicle> {
    public WorldVehicleMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new VehicleMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new VehicleMarkerBuilder(plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public Collection<Vehicle> getElements(World world) {
        return world.getEntitiesByClass(Vehicle.class)
                .stream()
                .filter(vehicle -> !(vehicle instanceof Mob))
                .toList();
    }
}
