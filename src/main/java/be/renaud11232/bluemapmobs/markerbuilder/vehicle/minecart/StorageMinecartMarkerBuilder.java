package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.minecart.StorageMinecart;

import java.util.Optional;

public class StorageMinecartMarkerBuilder extends EntityMarkerBuilder<StorageMinecart> {
    @Override
    public Optional<POIMarker> buildDefault(StorageMinecart storageMinecart) {
        return super.buildDefault(storageMinecart).map(marker -> {
            marker.setIcon(Icon.CHEST_MINECART.getPath(), Icon.CHEST_MINECART.getAnchor());
            return marker;
        });
    }
}
