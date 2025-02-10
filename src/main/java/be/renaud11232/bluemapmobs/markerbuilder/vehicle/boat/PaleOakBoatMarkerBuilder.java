package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.PaleOakBoat;

import java.util.Optional;

public class PaleOakBoatMarkerBuilder extends VehicleEntityMarkerBuilder<PaleOakBoat> {

    public PaleOakBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PaleOakBoat paleOakBoat) {
        return super.buildDefault(paleOakBoat).map(marker -> {
            marker.setIcon(Icon.PALE_OAK_BOAT.getPath(), Icon.PALE_OAK_BOAT.getAnchor());
            return marker;
        });
    }
}
