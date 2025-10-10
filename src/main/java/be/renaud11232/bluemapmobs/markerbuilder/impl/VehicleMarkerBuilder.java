package be.renaud11232.bluemapmobs.markerbuilder.impl;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.BoatMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.MinecartMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Vehicle;


public class VehicleMarkerBuilder extends AbstractVehicleMarkerBuilder<Vehicle> {

    public VehicleMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Vehicle> registry) {
        registry.register(Boat.class, new BoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Minecart.class, new MinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
