package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster.EvokerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster.IllusionerMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.Spellcaster;

public class SpellcasterMarkerBuilder extends MobEntityMarkerBuilder<Spellcaster> {
    public SpellcasterMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Evoker.class, new EvokerMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Illusioner.class, new IllusionerMarkerBuilder(config, defaultConfig));
    }
}
