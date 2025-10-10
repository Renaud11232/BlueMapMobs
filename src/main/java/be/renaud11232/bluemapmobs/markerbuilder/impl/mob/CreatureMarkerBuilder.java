package be.renaud11232.bluemapmobs.markerbuilder.impl.mob;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.*;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class CreatureMarkerBuilder extends AbstractMobMarkerBuilder<Creature> {
    public CreatureMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Creature> registry) {
        registry.register(Animals.class, new AnimalsMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Allay.class, new AllayMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Golem.class, new GolemMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Monster.class, new MonsterMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(NPC.class, new NPCMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(WaterMob.class, new WaterMobMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
