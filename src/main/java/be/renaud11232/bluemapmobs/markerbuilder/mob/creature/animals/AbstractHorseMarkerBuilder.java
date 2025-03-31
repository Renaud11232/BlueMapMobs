package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractHorseMarkerBuilder extends MobEntityMarkerBuilder<AbstractHorse> {
    public AbstractHorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractHorse> registry) {
        registry.register(Camel.class, new CamelMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(ChestedHorse.class, new ChestedHorseMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Horse.class, new HorseMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(SkeletonHorse.class, new SkeletonHorseMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(ZombieHorse.class, new ZombieHorseMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
