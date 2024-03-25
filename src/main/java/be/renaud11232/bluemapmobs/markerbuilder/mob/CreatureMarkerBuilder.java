package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.*;
import org.bukkit.entity.*;

public class CreatureMarkerBuilder extends MobEntityMarkerBuilder<Creature> {
    public CreatureMarkerBuilder() {
        registerMarkerBuilder(Ageable.class, new AgeableMarkerBuilder());
        registerMarkerBuilder(Allay.class, new AllayMarkerBuilder());
        registerMarkerBuilder(Golem.class, new GolemMarkerBuilder());
        registerMarkerBuilder(Monster.class, new MonsterMarkerBuilder());
        registerMarkerBuilder(NPC.class, new NPCMarkerBuilder());
        registerMarkerBuilder(WaterMob.class, new WaterMobMarkerBuilder());
    }
}
