package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractHorseMarkerBuilder extends MobEntityMarkerBuilder<AbstractHorse> {
    public AbstractHorseMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Camel.class, new CamelMarkerBuilder(config));
        registerMarkerBuilder(ChestedHorse.class, new ChestedHorseMarkerBuilder(config));
        registerMarkerBuilder(Horse.class, new HorseMarkerBuilder(config));
        registerMarkerBuilder(SkeletonHorse.class, new SkeletonHorseMarkerBuilder(config));
        registerMarkerBuilder(ZombieHorse.class, new ZombieHorseMarkerBuilder(config));
    }
}
