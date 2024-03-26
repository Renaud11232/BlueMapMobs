package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.PillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.SpellcasterMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.VindicatorMarkerBuilder;
import org.bukkit.entity.Illager;
import org.bukkit.entity.Pillager;
import org.bukkit.entity.Spellcaster;
import org.bukkit.entity.Vindicator;

public class IllagerMarkerBuilder extends MobEntityMarkerBuilder<Illager> {
    public IllagerMarkerBuilder() {
        registerMarkerBuilder(Pillager.class, new PillagerMarkerBuilder());
        registerMarkerBuilder(Spellcaster.class, new SpellcasterMarkerBuilder());
        registerMarkerBuilder(Vindicator.class, new VindicatorMarkerBuilder());
    }
}
