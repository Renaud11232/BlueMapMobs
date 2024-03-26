package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.minecart.*;

public class MinecartMarkerBuilder extends EntityMarkerBuilder<Minecart> {

    public MinecartMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(CommandMinecart.class, new CommandMinecartMarkerBuilder(config));
        registerMarkerBuilder(ExplosiveMinecart.class, new ExplosiveMinecartMarkerBuilder(config));
        registerMarkerBuilder(HopperMinecart.class, new HopperMinecartMarkerBuilder(config));
        registerMarkerBuilder(PoweredMinecart.class, new PoweredMinecartMarkerBuilder(config));
        registerMarkerBuilder(RideableMinecart.class, new RideableMinecartMarkerBuilder(config));
        registerMarkerBuilder(SpawnerMinecart.class, new SpawnerMinecartMarkerBuilder(config));
        registerMarkerBuilder(StorageMinecart.class, new StorageMinecartMarkerBuilder(config));
    }
}
