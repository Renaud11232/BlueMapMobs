package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.minecart.StorageMinecart;

import java.util.Optional;

public class StorageMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<StorageMinecart> {
    @Override
    public Optional<Marker> build(StorageMinecart storageMinecart) {
        return VehicleEntityMarkerBuilder.super.build(storageMinecart);
    }
}
