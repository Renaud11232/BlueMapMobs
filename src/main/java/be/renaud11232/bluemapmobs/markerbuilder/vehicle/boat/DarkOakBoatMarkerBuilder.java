package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.DarkOakBoat;

import java.util.Optional;

public class DarkOakBoatMarkerBuilder extends VehicleEntityMarkerBuilder<DarkOakBoat> {

    public DarkOakBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(DarkOakBoat darkOakBoat) {
        return super.buildDefault(darkOakBoat).map(marker -> {
            marker.setIcon(Icon.DARK_OAK_BOAT.getPath(), Icon.DARK_OAK_BOAT.getAnchor());
            return marker;
        });
    }
}
