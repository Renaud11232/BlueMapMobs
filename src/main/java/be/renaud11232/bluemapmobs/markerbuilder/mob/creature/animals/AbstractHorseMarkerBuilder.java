package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractHorseMarkerBuilder extends MobEntityMarkerBuilder<AbstractHorse> {
    public AbstractHorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Camel.class, new CamelMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(ChestedHorse.class, new ChestedHorseMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Horse.class, new HorseMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(SkeletonHorse.class, new SkeletonHorseMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(ZombieHorse.class, new ZombieHorseMarkerBuilder(config, defaultConfig));
    }
}
