package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Optional;

public abstract class MobEntityMarkerBuilder<T extends Mob> extends EntityMarkerBuilder<T> {
    public MobEntityMarkerBuilder(FileConfiguration config, MobMarkerVisibilityConfiguration visibilityConfiguration, Icon defaultIcon) {
        super(config, visibilityConfiguration, defaultIcon);
    }

    public MobEntityMarkerBuilder(FileConfiguration config, MobMarkerVisibilityConfiguration visibilityConfiguration) {
        super(config, visibilityConfiguration);
    }

    public MobEntityMarkerBuilder(FileConfiguration config, Icon defaultIcon) {
        super(config, defaultIcon);
    }

    public MobEntityMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(T mob) {
        return super.buildDefault(mob).map(marker ->  {
            Location eyeLocation = mob.getEyeLocation();
            marker.setPosition(eyeLocation.getX(), eyeLocation.getY(), eyeLocation.getZ());
            marker.setMaxDistance(getConfig().getDouble("marker_sets.mobs.markers.max_distance", 1000));
            return marker;
        });
    }

}
