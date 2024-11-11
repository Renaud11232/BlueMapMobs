package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MonsterMarkerBuilder extends MobEntityMarkerBuilder<Monster> {
    public MonsterMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(AbstractSkeleton.class, new AbstractSkeletonMarkerBuilder(config));
        registerMarkerBuilder(Blaze.class, new BlazeMarkerBuilder(config));
        registerMarkerBuilder(Breeze.class, new BreezeMarkerBuilder(config));
        registerMarkerBuilder(Creaking.class, new CreakingMarkerBuilder(config));
        registerMarkerBuilder(Creeper.class, new CreeperMarkerBuilder(config));
        registerMarkerBuilder(Enderman.class, new EndermanMarkerBuilder(config));
        registerMarkerBuilder(Endermite.class, new EndermiteMarkerBuilder(config));
        registerMarkerBuilder(Giant.class, new GiantMarkerBuilder(config));
        registerMarkerBuilder(Guardian.class, new GuardianMarkerBuilder(config));
        registerMarkerBuilder(PiglinAbstract.class, new PiglinAbstractMarkerBuilder(config));
        registerMarkerBuilder(Raider.class, new RaiderMarkerBuilder(config));
        registerMarkerBuilder(Silverfish.class, new SilverfishMarkerBuilder(config));
        registerMarkerBuilder(Spider.class, new SpiderMarkerBuilder(config));
        registerMarkerBuilder(Vex.class, new VexMarkerBuilder(config));
        registerMarkerBuilder(Warden.class, new WardenMarkerBuilder(config));
        registerMarkerBuilder(Wither.class, new WitherMarkerBuilder(config));
        registerMarkerBuilder(Zoglin.class, new ZoglinMarkerBuilder(config));
        registerMarkerBuilder(Zombie.class, new ZombieMarkerBuilder(config));
    }
}
