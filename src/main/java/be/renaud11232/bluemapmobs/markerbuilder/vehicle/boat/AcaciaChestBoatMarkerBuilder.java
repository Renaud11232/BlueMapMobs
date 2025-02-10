package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.AcaciaChestBoat;

import java.util.Optional;

public class AcaciaChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<AcaciaChestBoat> {

    public AcaciaChestBoatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(AcaciaChestBoat acaciaChestBoat) {
        return super.buildDefault(acaciaChestBoat).map(marker -> {
            marker.setIcon(Icon.ACACIA_CHEST_BOAT.getPath(), Icon.ACACIA_CHEST_BOAT.getAnchor());
            return marker;
        });
    }
}
