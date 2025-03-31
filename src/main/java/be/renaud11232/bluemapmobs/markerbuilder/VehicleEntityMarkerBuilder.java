package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Optional;

public class VehicleEntityMarkerBuilder<T extends Vehicle> extends EntityMarkerBuilder<T> {
    public VehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(T vehicle) {
        return super.build(vehicle).map(marker -> {
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            return marker;
        });
    }
}
