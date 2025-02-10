package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BirchChestBoat;

import java.util.Optional;

public class BirchChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<BirchChestBoat> {

    public BirchChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(BirchChestBoat birchChestBoat) {
        return super.buildDefault(birchChestBoat).map(marker -> {
            marker.setIcon(Icon.BIRCH_CHEST_BOAT.getPath(), Icon.BIRCH_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
