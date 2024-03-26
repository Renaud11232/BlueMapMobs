package be.renaud11232.bluemapmobs.updater;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.VehicleMarkerSetBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Vehicle;

import java.util.Collection;

public class WorldVehicleMarkerUpdater extends WorldEntityMarkerUpdater<Vehicle> {

    public WorldVehicleMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new VehicleMarkerSetBuilder(plugin.getConfig()), new VehicleMarkerBuilder(plugin.getConfig()));
    }

    @Override
    public Collection<Vehicle> getEntities(World world) {
        return world.getEntitiesByClass(Vehicle.class);
    }
}
