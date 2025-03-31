package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.PillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.SpellcasterMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.VindicatorMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illager;
import org.bukkit.entity.Pillager;
import org.bukkit.entity.Spellcaster;
import org.bukkit.entity.Vindicator;

public class IllagerMarkerBuilder extends MobEntityMarkerBuilder<Illager> {
    public IllagerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Illager> registry) {
        registry.register(Pillager.class, new PillagerMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Spellcaster.class, new SpellcasterMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Vindicator.class, new VindicatorMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
