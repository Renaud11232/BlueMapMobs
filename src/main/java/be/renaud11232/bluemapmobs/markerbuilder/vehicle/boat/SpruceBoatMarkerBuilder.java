package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.SpruceBoat;

import java.util.Optional;

public class SpruceBoatMarkerBuilder extends VehicleEntityMarkerBuilder<SpruceBoat> {

    public SpruceBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(SpruceBoat spruceBoat) {
        return super.buildDefault(spruceBoat).map(marker -> {
            marker.setIcon(Icon.SPRUCE_BOAT.getPath(), Icon.SPRUCE_BOAT.getAnchor());
            return marker;
        });
    }
}
