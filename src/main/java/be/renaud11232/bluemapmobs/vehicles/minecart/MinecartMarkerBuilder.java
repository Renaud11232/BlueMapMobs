package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
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
    public Optional<POIMarker> build(Minecart minecart) {
        if (minecart instanceof CommandMinecart commandMinecart) {
            return commandMinecartMarkerBuilder.build(commandMinecart);
        } else if (minecart instanceof ExplosiveMinecart explosiveMinecart) {
            return explosiveMinecartMarkerBuilder.build(explosiveMinecart);
        } else if (minecart instanceof HopperMinecart hopperMinecart) {
            return hopperMinecartMarkerBuilder.build(hopperMinecart);
        } else if (minecart instanceof PoweredMinecart poweredMinecart) {
            return poweredMinecartMarkerBuilder.build(poweredMinecart);
        } else if (minecart instanceof RideableMinecart rideableMinecart) {
            return rideableMinecartMarkerBuilder.build(rideableMinecart);
        } else if (minecart instanceof SpawnerMinecart spawnerMinecart) {
            return spawnerMinecartMarkerBuilder.build(spawnerMinecart);
        } else if (minecart instanceof StorageMinecart storageMinecart) {
            return storageMinecartMarkerBuilder.build(storageMinecart);
        }
        return VehicleEntityMarkerBuilder.super.build(minecart);
    }
}
