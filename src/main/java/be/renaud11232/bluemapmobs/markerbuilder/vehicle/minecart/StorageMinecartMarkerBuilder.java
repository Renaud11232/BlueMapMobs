package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.StorageMinecart;

import java.util.Optional;

public class StorageMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<StorageMinecart> {

    public StorageMinecartMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(StorageMinecart storageMinecart) {
        return super.buildDefault(storageMinecart).map(marker -> {
            marker.setIcon(Icon.CHEST_MINECART.getPath(), Icon.CHEST_MINECART.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.vehicles.markers.types.storage_minecart", true);
    }
}
