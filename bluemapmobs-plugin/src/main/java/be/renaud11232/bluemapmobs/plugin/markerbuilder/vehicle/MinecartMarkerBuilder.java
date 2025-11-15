package be.renaud11232.bluemapmobs.plugin.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.vehicle.minecart.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.minecart.*;

public class MinecartMarkerBuilder extends AbstractVehicleMarkerBuilder<Minecart> {

    public MinecartMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Minecart> registry) {
        registry.register(CommandMinecart.class, new CommandMinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(ExplosiveMinecart.class, new ExplosiveMinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(HopperMinecart.class, new HopperMinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(PoweredMinecart.class, new PoweredMinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(RideableMinecart.class, new RideableMinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(SpawnerMinecart.class, new SpawnerMinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(StorageMinecart.class, new StorageMinecartMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
