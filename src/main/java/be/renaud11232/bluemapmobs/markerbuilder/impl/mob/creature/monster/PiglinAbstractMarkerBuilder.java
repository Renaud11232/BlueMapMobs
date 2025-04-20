package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.piglinabstract.PiglinBruteMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.piglinabstract.PiglinMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.PiglinAbstract;
import org.bukkit.entity.PiglinBrute;

public class PiglinAbstractMarkerBuilder extends AbstractMobMarkerBuilder<PiglinAbstract> {
    public PiglinAbstractMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<PiglinAbstract> registry) {
        registry.register(Piglin.class, new PiglinMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(PiglinBrute.class, new PiglinBruteMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
