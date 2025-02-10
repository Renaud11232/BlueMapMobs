package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.JungleChestBoat;

import java.util.Optional;

public class JungleChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<JungleChestBoat> {

    public JungleChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(JungleChestBoat jungleChestBoat) {
        return super.buildDefault(jungleChestBoat).map(marker -> {
            marker.setIcon(Icon.JUNGLE_CHEST_BOAT.getPath(), Icon.JUNGLE_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
