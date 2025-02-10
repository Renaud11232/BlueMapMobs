package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.MangroveBoat;

import java.util.Optional;

public class MangroveBoatMarkerBuilder extends VehicleEntityMarkerBuilder<MangroveBoat> {

    public MangroveBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(MangroveBoat mangroveBoat) {
        return super.buildDefault(mangroveBoat).map(marker -> {
            marker.setIcon(Icon.MANGROVE_BOAT.getPath(), Icon.MANGROVE_BOAT.getAnchor());
            return marker;
        });
    }
}
