package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Skeleton;

public class SkeletonMarkerBuilder extends MobEntityMarkerBuilder<Skeleton> {
    public SkeletonMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SKELETON, BlueMapMobsIcon.Mob.SKELETON);
    }
}
