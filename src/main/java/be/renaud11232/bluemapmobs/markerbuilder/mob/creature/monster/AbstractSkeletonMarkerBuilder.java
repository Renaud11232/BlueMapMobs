package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton.BoggedMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton.SkeletonMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton.StrayMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton.WitherSkeletonMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractSkeletonMarkerBuilder extends MobEntityMarkerBuilder<AbstractSkeleton> {
    public AbstractSkeletonMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Bogged.class, new BoggedMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Skeleton.class, new SkeletonMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Stray.class, new StrayMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(WitherSkeleton.class, new WitherSkeletonMarkerBuilder(config, defaultConfig));
    }
}
