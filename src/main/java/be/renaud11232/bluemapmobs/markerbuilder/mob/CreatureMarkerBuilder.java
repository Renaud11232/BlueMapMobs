package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class CreatureMarkerBuilder extends MobEntityMarkerBuilder<Creature> {
    public CreatureMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Animals.class, new AnimalsMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Allay.class, new AllayMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Golem.class, new GolemMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Monster.class, new MonsterMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(NPC.class, new NPCMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(WaterMob.class, new WaterMobMarkerBuilder(config, defaultConfig));
    }
}
