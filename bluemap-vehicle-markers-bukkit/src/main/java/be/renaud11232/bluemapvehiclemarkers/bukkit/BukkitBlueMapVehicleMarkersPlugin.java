package be.renaud11232.bluemapvehiclemarkers.bukkit;

import be.renaud11232.bluemapentitymarkers.bukkit.BukkitBlueMapEntityMarkersPlugin;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Vehicle;

public class BukkitBlueMapVehicleMarkersPlugin extends BukkitBlueMapEntityMarkersPlugin<Vehicle> {
    @Override
    public Module<World, Vehicle> provideModule(BlueMapAPI api, Configuration configuration) {
        return new BukkitVehiclesModule(api, configuration);
    }
}
