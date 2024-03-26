package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.*;
import org.bukkit.entity.*;

public class AbstractHorseMarkerBuilder extends MobEntityMarkerBuilder<AbstractHorse> {
    public AbstractHorseMarkerBuilder() {
        registerMarkerBuilder(Camel.class, new CamelMarkerBuilder());
        registerMarkerBuilder(ChestedHorse.class, new ChestedHorseMarkerBuilder());
        registerMarkerBuilder(Horse.class, new HorseMarkerBuilder());
        registerMarkerBuilder(SkeletonHorse.class, new SkeletonHorseMarkerBuilder());
        registerMarkerBuilder(ZombieHorse.class, new ZombieHorseMarkerBuilder());
    }
}
