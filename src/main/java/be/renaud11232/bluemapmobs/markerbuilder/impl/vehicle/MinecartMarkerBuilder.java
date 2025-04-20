package be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.minecart.*;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.minecart.*;

public class MinecartMarkerBuilder extends AbstractVehicleMarkerBuilder<Minecart> {

    public MinecartMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Minecart> registry) {
        registry.register(CommandMinecart.class, new CommandMinecartMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(ExplosiveMinecart.class, new ExplosiveMinecartMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(HopperMinecart.class, new HopperMinecartMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(PoweredMinecart.class, new PoweredMinecartMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(RideableMinecart.class, new RideableMinecartMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(SpawnerMinecart.class, new SpawnerMinecartMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(StorageMinecart.class, new StorageMinecartMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
