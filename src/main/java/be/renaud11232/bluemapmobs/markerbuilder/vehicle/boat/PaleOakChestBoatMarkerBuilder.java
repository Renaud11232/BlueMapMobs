package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.PaleOakChestBoat;

import java.util.Optional;

public class PaleOakChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<PaleOakChestBoat> {

    public PaleOakChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PaleOakChestBoat paleOakChestBoat) {
        return super.buildDefault(paleOakChestBoat).map(marker -> {
            marker.setIcon(Icon.PALE_OAK_CHEST_BOAT.getPath(), Icon.PALE_OAK_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
