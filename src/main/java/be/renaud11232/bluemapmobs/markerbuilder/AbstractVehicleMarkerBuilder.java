package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Optional;

public abstract class AbstractVehicleMarkerBuilder<T extends Vehicle> extends AbstractEntityMarkerBuilder<T> {
    public AbstractVehicleMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(T vehicle) {
        return super.build(vehicle).map(marker -> {
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            return marker;
        });
    }
}
