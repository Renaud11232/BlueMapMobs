package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Optional;

public abstract class VehicleEntityMarkerBuilder<T extends Vehicle> extends EntityMarkerBuilder<T> {
    public VehicleEntityMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(T entity) {
        return super.buildDefault(entity).map(marker -> {
            marker.setMaxDistance(getConfig().getDouble("marker_sets.vehicles.markers.max_distance", 1000));
            return marker;
        });
    }
}
