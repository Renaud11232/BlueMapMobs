package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class CreatureMarkerBuilder extends MobEntityMarkerBuilder<Creature> {
    public CreatureMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Animals.class, new AnimalsMarkerBuilder(config));
        registerMarkerBuilder(Allay.class, new AllayMarkerBuilder(config));
        registerMarkerBuilder(Golem.class, new GolemMarkerBuilder(config));
        registerMarkerBuilder(Monster.class, new MonsterMarkerBuilder(config));
        registerMarkerBuilder(NPC.class, new NPCMarkerBuilder(config));
        registerMarkerBuilder(WaterMob.class, new WaterMobMarkerBuilder(config));
    }
}
