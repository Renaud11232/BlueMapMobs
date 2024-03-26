package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton.SkeletonMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton.StrayMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton.WitherSkeletonMarkerBuilder;
import org.bukkit.entity.AbstractSkeleton;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Stray;
import org.bukkit.entity.WitherSkeleton;

public class AbstractSkeletonMarkerBuilder extends MobEntityMarkerBuilder<AbstractSkeleton> {
    public AbstractSkeletonMarkerBuilder() {
        registerMarkerBuilder(Skeleton.class, new SkeletonMarkerBuilder());
        registerMarkerBuilder(Stray.class, new StrayMarkerBuilder());
        registerMarkerBuilder(WitherSkeleton.class, new WitherSkeletonMarkerBuilder());
    }
}
