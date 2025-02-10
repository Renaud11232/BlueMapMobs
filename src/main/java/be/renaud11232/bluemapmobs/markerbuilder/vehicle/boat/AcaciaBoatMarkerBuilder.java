package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaBoat;

import java.util.Optional;

public class AcaciaBoatMarkerBuilder extends VehicleEntityMarkerBuilder<AcaciaBoat> {

    public AcaciaBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(AcaciaBoat acaciaBoat) {
        return super.buildDefault(acaciaBoat).map(marker -> {
            marker.setIcon(Icon.ACACIA_BOAT.getPath(), Icon.ACACIA_BOAT.getAnchor());
            return marker;
        });
    }
}
