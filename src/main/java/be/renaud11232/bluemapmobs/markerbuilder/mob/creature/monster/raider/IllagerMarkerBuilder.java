package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.PillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.SpellcasterMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.VindicatorMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illager;
import org.bukkit.entity.Pillager;
import org.bukkit.entity.Spellcaster;
import org.bukkit.entity.Vindicator;

public class IllagerMarkerBuilder extends MobEntityMarkerBuilder<Illager> {
    public IllagerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Pillager.class, new PillagerMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Spellcaster.class, new SpellcasterMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Vindicator.class, new VindicatorMarkerBuilder(config, defaultConfig));
    }
}
