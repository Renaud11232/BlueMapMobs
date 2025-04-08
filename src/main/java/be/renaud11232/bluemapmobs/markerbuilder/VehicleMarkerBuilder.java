package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.vehicle.BoatMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.MinecartMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Vehicle;


public class VehicleMarkerBuilder extends VehicleEntityMarkerBuilder<Vehicle> {

    public VehicleMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Vehicle> registry) {
        registry.register(Boat.class, new BoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Minecart.class, new MinecartMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
