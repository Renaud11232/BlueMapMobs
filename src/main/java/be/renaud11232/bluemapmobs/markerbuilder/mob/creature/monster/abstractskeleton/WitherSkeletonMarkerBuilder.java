package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.WitherSkeleton;

public class WitherSkeletonMarkerBuilder extends SingleIconMobEntityMarkerBuilder<WitherSkeleton> {
    public WitherSkeletonMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.wither_skeleton", Icon.WITHER_SKELETON);
    }
}
