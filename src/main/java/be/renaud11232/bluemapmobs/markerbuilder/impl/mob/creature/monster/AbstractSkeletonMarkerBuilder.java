package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.abstractskeleton.BoggedMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.abstractskeleton.SkeletonMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.abstractskeleton.StrayMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.abstractskeleton.WitherSkeletonMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractSkeletonMarkerBuilder extends AbstractMobMarkerBuilder<AbstractSkeleton> {
    public AbstractSkeletonMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractSkeleton> registry) {
        registry.register(Bogged.class, new BoggedMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Skeleton.class, new SkeletonMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Stray.class, new StrayMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(WitherSkeleton.class, new WitherSkeletonMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
