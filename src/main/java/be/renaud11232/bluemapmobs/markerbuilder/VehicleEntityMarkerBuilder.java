package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Optional;

public abstract class VehicleEntityMarkerBuilder<T extends Vehicle> extends EntityMarkerBuilder<T> {
    public VehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig, BooleanConfiguration visibilityConfiguration, Icon defaultIcon) {
        super(config, defaultConfig, visibilityConfiguration, defaultIcon);
    }

    public VehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig, BooleanConfiguration visibilityConfiguration) {
        super(config, defaultConfig, visibilityConfiguration);
    }

    public VehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig, Icon defaultIcon) {
        super(config, defaultConfig, defaultIcon);
    }

    public VehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> buildDefault(T entity) {
        return super.buildDefault(entity).map(marker -> {
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            return marker;
        });
    }
}
