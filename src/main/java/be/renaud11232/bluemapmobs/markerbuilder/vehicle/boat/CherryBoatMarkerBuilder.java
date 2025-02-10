package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.CherryBoat;

import java.util.Optional;

public class CherryBoatMarkerBuilder extends VehicleEntityMarkerBuilder<CherryBoat> {

    public CherryBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(CherryBoat cherryBoat) {
        return super.buildDefault(cherryBoat).map(marker -> {
            marker.setIcon(Icon.CHERRY_BOAT.getPath(), Icon.CHERRY_BOAT.getAnchor());
            return marker;
        });
    }
}
