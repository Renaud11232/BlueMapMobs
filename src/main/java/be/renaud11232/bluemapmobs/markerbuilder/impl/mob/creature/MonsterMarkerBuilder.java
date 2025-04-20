package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.*;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MonsterMarkerBuilder extends AbstractMobMarkerBuilder<Monster> {
    public MonsterMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Monster> registry) {
        registry.register(AbstractSkeleton.class, new AbstractSkeletonMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Blaze.class, new BlazeMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Breeze.class, new BreezeMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Creaking.class, new CreakingMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Creeper.class, new CreeperMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Enderman.class, new EndermanMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Endermite.class, new EndermiteMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Giant.class, new GiantMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Guardian.class, new GuardianMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(PiglinAbstract.class, new PiglinAbstractMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Raider.class, new RaiderMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Silverfish.class, new SilverfishMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Spider.class, new SpiderMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Vex.class, new VexMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Warden.class, new WardenMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Wither.class, new WitherMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Zoglin.class, new ZoglinMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Zombie.class, new ZombieMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
