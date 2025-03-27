package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.WitherSkeleton;

public class WitherSkeletonMarkerBuilder extends MobEntityMarkerBuilder<WitherSkeleton> {
    public WitherSkeletonMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.WITHER_SKELETON, MobIcon.WITHER_SKELETON);
    }
}
