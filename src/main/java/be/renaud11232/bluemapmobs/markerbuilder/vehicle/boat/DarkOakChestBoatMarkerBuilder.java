package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.DarkOakChestBoat;

import java.util.Optional;

public class DarkOakChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<DarkOakChestBoat> {

    public DarkOakChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(DarkOakChestBoat darkOakChestBoat) {
        return super.buildDefault(darkOakChestBoat).map(marker -> {
            marker.setIcon(Icon.DARK_OAK_CHEST_BOAT.getPath(), Icon.DARK_OAK_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
