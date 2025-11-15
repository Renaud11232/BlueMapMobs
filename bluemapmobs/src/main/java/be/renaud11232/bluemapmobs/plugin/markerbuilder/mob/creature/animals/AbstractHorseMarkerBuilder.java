package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstracthorse.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AbstractHorseMarkerBuilder extends AbstractMobMarkerBuilder<AbstractHorse> {
    public AbstractHorseMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractHorse> registry) {
        registry.register(Camel.class, new CamelMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(ChestedHorse.class, new ChestedHorseMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Horse.class, new HorseMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(SkeletonHorse.class, new SkeletonHorseMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(ZombieHorse.class, new ZombieHorseMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
