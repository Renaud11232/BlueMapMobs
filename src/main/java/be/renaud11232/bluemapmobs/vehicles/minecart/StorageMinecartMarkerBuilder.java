package be.renaud11232.bluemapmobs.vehicles.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.vehicles.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.StorageMinecart;

import java.util.Optional;

public class StorageMinecartMarkerBuilder implements VehicleEntityMarkerBuilder<StorageMinecart> {
    @Override
    public Optional<POIMarker> build(StorageMinecart storageMinecart) {
        return VehicleEntityMarkerBuilder.super.build(storageMinecart).map(marker -> {
            marker.setIcon(Icon.STORAGE_MINECART.getPath(), Icon.STORAGE_MINECART.getAnchor());
            return marker;
        });
    }
}
