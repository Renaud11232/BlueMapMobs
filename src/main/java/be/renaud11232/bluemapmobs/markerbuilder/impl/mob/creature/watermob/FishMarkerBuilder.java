package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob.fish.*;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class FishMarkerBuilder extends AbstractMobMarkerBuilder<Fish> {
    public FishMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Fish> registry) {
        registry.register(Cod.class, new CodMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(PufferFish.class, new PufferFishMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Salmon.class, new SalmonMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Tadpole.class, new TadpoleMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(TropicalFish.class, new TropicalFishMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
