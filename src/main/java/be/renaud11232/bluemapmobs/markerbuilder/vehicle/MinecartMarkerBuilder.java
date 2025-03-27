package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.minecart.*;

public class MinecartMarkerBuilder extends VehicleEntityMarkerBuilder<Minecart> {

    public MinecartMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(CommandMinecart.class, new CommandMinecartMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(ExplosiveMinecart.class, new ExplosiveMinecartMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(HopperMinecart.class, new HopperMinecartMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(PoweredMinecart.class, new PoweredMinecartMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(RideableMinecart.class, new RideableMinecartMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(SpawnerMinecart.class, new SpawnerMinecartMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(StorageMinecart.class, new StorageMinecartMarkerBuilder(config, defaultConfig));
    }
}
