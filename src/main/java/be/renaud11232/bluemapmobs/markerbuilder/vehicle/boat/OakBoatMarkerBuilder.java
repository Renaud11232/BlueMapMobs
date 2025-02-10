package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.OakBoat;

import java.util.Optional;

public class OakBoatMarkerBuilder extends VehicleEntityMarkerBuilder<OakBoat> {

    public OakBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(OakBoat oakBoat) {
        return super.buildDefault(oakBoat).map(marker -> {
            marker.setIcon(Icon.OAK_BOAT.getPath(), Icon.OAK_BOAT.getAnchor());
            return marker;
        });
    }
}
