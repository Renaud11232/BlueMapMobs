package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

import java.util.Optional;

public abstract class AbstractOtherEntityMarkerBuilder<T extends Entity> extends AbstractEntityMarkerBuilder<T> {
    public AbstractOtherEntityMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Optional<POIMarker> build(T entity) {
        return super.build(entity).map(marker -> {
            if (entity instanceof LivingEntity livingEntity) {
                Location eyeLocation = livingEntity.getEyeLocation();
                marker.setPosition(eyeLocation.getX(), eyeLocation.getY(), eyeLocation.getZ());
            }
            marker.setMaxDistance(BlueMapMobsConfiguration.MarkerSets.Others.Markers.MAX_DISTANCE.get(getConfig(), getDefaultConfig()));
            return marker;
        });
    }
}
