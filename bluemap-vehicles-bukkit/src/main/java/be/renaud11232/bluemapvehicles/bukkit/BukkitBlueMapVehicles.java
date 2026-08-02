package be.renaud11232.bluemapvehicles.bukkit;

import be.renaud11232.bluemapentities.bukkit.BukkitBlueMapEntitiesPlugin;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Vehicle;

public class BukkitBlueMapVehicles extends BukkitBlueMapEntitiesPlugin<Vehicle> {
    @Override
    public Module<World, Vehicle> provideModule(BlueMapAPI api, Configuration configuration) {
        return new BukkitVehiclesModule(api, configuration);
    }
}
