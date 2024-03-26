package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster.EvokerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster.IllusionerMarkerBuilder;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.Spellcaster;

public class SpellcasterMarkerBuilder extends MobEntityMarkerBuilder<Spellcaster> {
    public SpellcasterMarkerBuilder() {
        registerMarkerBuilder(Evoker.class, new EvokerMarkerBuilder());
        registerMarkerBuilder(Illusioner.class, new IllusionerMarkerBuilder());
    }
}
