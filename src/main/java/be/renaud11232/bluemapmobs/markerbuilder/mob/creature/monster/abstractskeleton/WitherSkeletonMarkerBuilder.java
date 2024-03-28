package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.WitherSkeleton;

import java.util.Optional;

public class WitherSkeletonMarkerBuilder extends MobEntityMarkerBuilder<WitherSkeleton> {

    public WitherSkeletonMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(WitherSkeleton mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.WITHER_SKELETON.getPath(), Icon.WITHER_SKELETON.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.wither_skeleton", true);
    }
}
