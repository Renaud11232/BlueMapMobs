package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.SkeletonHorse;

public class SkeletonHorseMarkerBuilder extends MobEntityMarkerBuilder<SkeletonHorse> {
    public SkeletonHorseMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SKELETON_HORSE, MobIcon.SKELETON_HORSE);
    }
}
