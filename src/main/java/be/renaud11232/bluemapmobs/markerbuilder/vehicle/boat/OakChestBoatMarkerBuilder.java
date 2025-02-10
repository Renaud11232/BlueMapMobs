package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.OakChestBoat;

import java.util.Optional;

public class OakChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<OakChestBoat> {

    public OakChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(OakChestBoat oakChestBoat) {
        return super.buildDefault(oakChestBoat).map(marker -> {
            marker.setIcon(Icon.OAK_CHEST_BOAT.getPath(), Icon.OAK_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
