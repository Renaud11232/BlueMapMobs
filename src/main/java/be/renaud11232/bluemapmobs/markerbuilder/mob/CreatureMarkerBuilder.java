package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class CreatureMarkerBuilder extends MobEntityMarkerBuilder<Creature> {
    public CreatureMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Creature> registry) {
        registry.register(Animals.class, new AnimalsMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Allay.class, new AllayMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Golem.class, new GolemMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Monster.class, new MonsterMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(NPC.class, new NPCMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(WaterMob.class, new WaterMobMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
