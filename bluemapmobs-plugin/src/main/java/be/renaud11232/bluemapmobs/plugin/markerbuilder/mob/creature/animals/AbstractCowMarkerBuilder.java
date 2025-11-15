package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstractcow.CowMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstractcow.MushroomCowMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractCow;
import org.bukkit.entity.Cow;
import org.bukkit.entity.MushroomCow;

public class AbstractCowMarkerBuilder extends AbstractMobMarkerBuilder<AbstractCow> {
    public AbstractCowMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractCow> registry) {
        registry.register(Cow.class, new CowMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(MushroomCow.class, new MushroomCowMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
