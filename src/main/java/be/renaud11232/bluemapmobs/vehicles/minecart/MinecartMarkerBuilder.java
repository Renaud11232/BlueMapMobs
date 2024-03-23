package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.minecart.*;

import java.util.Optional;

public class MinecartMarkerBuilder implements VehicleEntityMarkerBuilder<Minecart> {

    private final CommandMinecartMarkerBuilder commandMinecartMarkerBuilder = new CommandMinecartMarkerBuilder();
    private final ExplosiveMinecartMarkerBuilder explosiveMinecartMarkerBuilder = new ExplosiveMinecartMarkerBuilder();
    private final HopperMinecartMarkerBuilder hopperMinecartMarkerBuilder = new HopperMinecartMarkerBuilder();
    private final PoweredMinecartMarkerBuilder poweredMinecartMarkerBuilder = new PoweredMinecartMarkerBuilder();
    private final RideableMinecartMarkerBuilder rideableMinecartMarkerBuilder = new RideableMinecartMarkerBuilder();
    private final SpawnerMinecartMarkerBuilder spawnerMinecartMarkerBuilder = new SpawnerMinecartMarkerBuilder();
    private final StorageMinecartMarkerBuilder storageMinecartMarkerBuilder = new StorageMinecartMarkerBuilder();

    @Override
    public Optional<Marker> build(Minecart minecart) {
        if (minecart instanceof CommandMinecart) {
            return commandMinecartMarkerBuilder.build((CommandMinecart) minecart);
        } else if (minecart instanceof ExplosiveMinecart) {
            return explosiveMinecartMarkerBuilder.build((ExplosiveMinecart) minecart);
        } else if (minecart instanceof HopperMinecart) {
            return hopperMinecartMarkerBuilder.build((HopperMinecart) minecart);
        } else if (minecart instanceof PoweredMinecart) {
            return poweredMinecartMarkerBuilder.build((PoweredMinecart) minecart);
        } else if (minecart instanceof RideableMinecart) {
            return rideableMinecartMarkerBuilder.build((RideableMinecart) minecart);
        } else if (minecart instanceof SpawnerMinecart) {
            return spawnerMinecartMarkerBuilder.build((SpawnerMinecart) minecart);
        } else if (minecart instanceof StorageMinecart) {
            return storageMinecartMarkerBuilder.build((StorageMinecart) minecart);
        }
        return VehicleEntityMarkerBuilder.super.build(minecart);
    }
}
