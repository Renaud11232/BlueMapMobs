package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract.PiglinBruteMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract.PiglinMarkerBuilder;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.PiglinAbstract;
import org.bukkit.entity.PiglinBrute;

public class PiglinAbstractMarkerBuilder extends MobEntityMarkerBuilder<PiglinAbstract> {
    public PiglinAbstractMarkerBuilder() {
        registerMarkerBuilder(Piglin.class, new PiglinMarkerBuilder());
        registerMarkerBuilder(PiglinBrute.class, new PiglinBruteMarkerBuilder());
    }
}
