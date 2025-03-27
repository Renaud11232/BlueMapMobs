package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.SkeletonHorse;

public class SkeletonHorseMarkerBuilder extends MobEntityMarkerBuilder<SkeletonHorse> {
    public SkeletonHorseMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SKELETON_HORSE, BlueMapMobsIcon.Mob.SKELETON_HORSE);
    }
}
