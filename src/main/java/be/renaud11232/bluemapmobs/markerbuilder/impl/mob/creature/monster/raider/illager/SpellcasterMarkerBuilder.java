package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.raider.illager.spellcaster.EvokerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.raider.illager.spellcaster.IllusionerMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.Spellcaster;

public class SpellcasterMarkerBuilder extends AbstractMobMarkerBuilder<Spellcaster> {
    public SpellcasterMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Spellcaster> registry) {
        registry.register(Evoker.class, new EvokerMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Illusioner.class, new IllusionerMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
