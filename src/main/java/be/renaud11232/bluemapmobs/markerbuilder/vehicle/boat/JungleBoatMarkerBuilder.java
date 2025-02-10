package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.JungleBoat;

import java.util.Optional;

public class JungleBoatMarkerBuilder extends VehicleEntityMarkerBuilder<JungleBoat> {

    public JungleBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(JungleBoat jungleBoat) {
        return super.buildDefault(jungleBoat).map(marker -> {
            marker.setIcon(Icon.JUNGLE_BOAT.getPath(), Icon.JUNGLE_BOAT.getAnchor());
            return marker;
        });
    }
}
