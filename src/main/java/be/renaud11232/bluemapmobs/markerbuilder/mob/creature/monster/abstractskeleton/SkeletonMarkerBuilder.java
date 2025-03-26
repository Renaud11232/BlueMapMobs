package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Skeleton;

public class SkeletonMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Skeleton> {
    public SkeletonMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.skeleton", Icon.SKELETON);
    }
}
