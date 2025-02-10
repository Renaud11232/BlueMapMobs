package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.MangroveChestBoat;

import java.util.Optional;

public class MangroveChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<MangroveChestBoat> {

    public MangroveChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(MangroveChestBoat mangroveChestBoat) {
        return super.buildDefault(mangroveChestBoat).map(marker -> {
            marker.setIcon(Icon.MANGROVE_CHEST_BOAT.getPath(), Icon.MANGROVE_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
