package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish.*;
import org.bukkit.entity.*;

public class FishMarkerBuilder extends MobEntityMarkerBuilder<Fish> {
    public FishMarkerBuilder() {
        registerMarkerBuilder(Cod.class, new CodMarkerBuilder());
        registerMarkerBuilder(PufferFish.class, new PufferFishMarkerBuilder());
        registerMarkerBuilder(Salmon.class, new SalmonMarkerBuilder());
        registerMarkerBuilder(Tadpole.class, new TadpoleMarkerBuilder());
        registerMarkerBuilder(TropicalFish.class, new TropicalFishMarkerBuilder());
    }
}
