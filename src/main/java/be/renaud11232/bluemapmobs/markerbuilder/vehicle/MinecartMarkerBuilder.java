package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart.*;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.minecart.*;

public class MinecartMarkerBuilder extends EntityMarkerBuilder<Minecart> {

    public MinecartMarkerBuilder() {
        registerMarkerBuilder(CommandMinecart.class, new CommandMinecartMarkerBuilder());
        registerMarkerBuilder(ExplosiveMinecart.class, new ExplosiveMinecartMarkerBuilder());
        registerMarkerBuilder(HopperMinecart.class, new HopperMinecartMarkerBuilder());
        registerMarkerBuilder(PoweredMinecart.class, new PoweredMinecartMarkerBuilder());
        registerMarkerBuilder(RideableMinecart.class, new RideableMinecartMarkerBuilder());
        registerMarkerBuilder(SpawnerMinecart.class, new SpawnerMinecartMarkerBuilder());
        registerMarkerBuilder(StorageMinecart.class, new StorageMinecartMarkerBuilder());
    }

}
