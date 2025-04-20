package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.raider.IllagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.raider.RavagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.raider.WitchMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illager;
import org.bukkit.entity.Raider;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Witch;

public class RaiderMarkerBuilder extends AbstractMobMarkerBuilder<Raider> {
    public RaiderMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Raider> registry) {
        registry.register(Illager.class, new IllagerMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Ravager.class, new RavagerMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Witch.class, new WitchMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
