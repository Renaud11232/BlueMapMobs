package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.*;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractHorseMarkerBuilder extends AbstractMobMarkerBuilder<AbstractHorse> {
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
