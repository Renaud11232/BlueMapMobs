package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Skeleton;

import java.util.Optional;

public class SkeletonMarkerBuilder extends MobEntityMarkerBuilder<Skeleton> {

    public SkeletonMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Skeleton mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.SKELETON.getPath(), Icon.SKELETON.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.skeleton", true);
    }
}
