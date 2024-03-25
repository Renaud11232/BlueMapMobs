package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.mob.*;
import org.bukkit.entity.*;

public class MobMarkerBuilder extends MobEntityMarkerBuilder<Mob> {

    public MobMarkerBuilder() {
        registerMarkerBuilder(Ambient.class, new AmbientMarkerBuilder());
        registerMarkerBuilder(Creature.class, new CreatureMarkerBuilder());
        registerMarkerBuilder(EnderDragon.class, new EnderDragonMarkerBuilder());
        registerMarkerBuilder(Flying.class, new FlyingMarkerBuilder());
        registerMarkerBuilder(Slime.class, new SlimeMarkerBuilder());
    }
}
