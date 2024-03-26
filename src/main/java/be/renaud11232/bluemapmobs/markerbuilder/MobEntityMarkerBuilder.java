package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Optional;

public abstract class MobEntityMarkerBuilder<T extends Mob> extends EntityMarkerBuilder<T> {

    public MobEntityMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(T mob) {
        return super.buildDefault(mob).map(marker ->  {
            marker.setPosition(mob.getX(), mob.getY() + mob.getEyeHeight(), mob.getZ());
            marker.setMaxDistance(getConfig().getDouble("marker_sets.mobs.markers.max_distance", 1000));
            return marker;
        });
    }

}
