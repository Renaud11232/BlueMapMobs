package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

import java.util.Optional;

public abstract class OtherEntityMarkerBuilder<T extends Entity> extends EntityMarkerBuilder<T> {
    public OtherEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(T entity) {
        return super.build(entity).map(marker -> {
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.Others.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            return marker;
        });
    }
}
