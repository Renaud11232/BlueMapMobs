package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BirchBoat;

import java.util.Optional;

public class BirchBoatMarkerBuilder extends VehicleEntityMarkerBuilder<BirchBoat> {

    public BirchBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(BirchBoat birchBoat) {
        return super.buildDefault(birchBoat).map(marker -> {
            marker.setIcon(Icon.BIRCH_BOAT.getPath(), Icon.BIRCH_BOAT.getAnchor());
            return marker;
        });
    }
}
