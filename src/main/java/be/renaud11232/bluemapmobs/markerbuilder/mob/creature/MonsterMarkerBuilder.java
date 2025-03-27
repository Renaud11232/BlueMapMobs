package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MonsterMarkerBuilder extends MobEntityMarkerBuilder<Monster> {
    public MonsterMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(AbstractSkeleton.class, new AbstractSkeletonMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Blaze.class, new BlazeMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Breeze.class, new BreezeMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Creaking.class, new CreakingMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Creeper.class, new CreeperMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Enderman.class, new EndermanMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Endermite.class, new EndermiteMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Giant.class, new GiantMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Guardian.class, new GuardianMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(PiglinAbstract.class, new PiglinAbstractMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Raider.class, new RaiderMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Silverfish.class, new SilverfishMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Spider.class, new SpiderMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Vex.class, new VexMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Warden.class, new WardenMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Wither.class, new WitherMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Zoglin.class, new ZoglinMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Zombie.class, new ZombieMarkerBuilder(config, defaultConfig));
    }
}
