package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstractcow.CowMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstractcow.MushroomCowMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractCow;
import org.bukkit.entity.Cow;
import org.bukkit.entity.MushroomCow;

public class AbstractCowMarkerBuilder extends AbstractMobMarkerBuilder<AbstractCow> {
    public AbstractCowMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractCow> registry) {
        registry.register(Cow.class, new CowMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(MushroomCow.class, new MushroomCowMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
