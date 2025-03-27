package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Skeleton;

public class SkeletonMarkerBuilder extends MobEntityMarkerBuilder<Skeleton> {
    public SkeletonMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SKELETON, MobIcon.SKELETON);
    }
}
