package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.SpruceChestBoat;

import java.util.Optional;

public class SpruceChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<SpruceChestBoat> {

    public SpruceChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(SpruceChestBoat spruceChestBoat) {
        return super.buildDefault(spruceChestBoat).map(marker -> {
            marker.setIcon(Icon.SPRUCE_CHEST_BOAT.getPath(), Icon.SPRUCE_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
