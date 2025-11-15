package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.abstractskeleton.BoggedMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.abstractskeleton.SkeletonMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.abstractskeleton.StrayMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.abstractskeleton.WitherSkeletonMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractSkeletonMarkerBuilder extends AbstractMobMarkerBuilder<AbstractSkeleton> {
    public AbstractSkeletonMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractSkeleton> registry) {
        registry.register(Bogged.class, new BoggedMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Skeleton.class, new SkeletonMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Stray.class, new StrayMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(WitherSkeleton.class, new WitherSkeletonMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
