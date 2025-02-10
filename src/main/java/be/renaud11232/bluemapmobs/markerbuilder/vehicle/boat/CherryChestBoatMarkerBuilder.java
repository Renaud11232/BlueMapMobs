package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.CherryChestBoat;

import java.util.Optional;

public class CherryChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<CherryChestBoat> {

    public CherryChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(CherryChestBoat cherryChestBoat) {
        return super.buildDefault(cherryChestBoat).map(marker -> {
            marker.setIcon(Icon.CHERRY_CHEST_BOAT.getPath(), Icon.CHERRY_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
