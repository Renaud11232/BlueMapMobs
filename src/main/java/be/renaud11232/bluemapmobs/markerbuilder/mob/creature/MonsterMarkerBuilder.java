package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.*;
import org.bukkit.entity.*;

public class MonsterMarkerBuilder extends MobEntityMarkerBuilder<Monster> {
    public MonsterMarkerBuilder() {
        registerMarkerBuilder(AbstractSkeleton.class, new AbstractSkeletonMarkerBuilder());
        registerMarkerBuilder(Blaze.class, new BlazeMarkerBuilder());
        registerMarkerBuilder(Breeze.class, new BreezeMarkerBuilder());
        registerMarkerBuilder(Creeper.class, new CreeperMarkerBuilder());
        registerMarkerBuilder(Enderman.class, new EndermanMarkerBuilder());
        registerMarkerBuilder(Endermite.class, new EndermiteMarkerBuilder());
        registerMarkerBuilder(Giant.class, new GiantMarkerBuilder());
        registerMarkerBuilder(Guardian.class, new GuardianMarkerBuilder());
        registerMarkerBuilder(PiglinAbstract.class, new PiglinAbstractMarkerBuilder());
        registerMarkerBuilder(Raider.class, new RaiderMarkerBuilder());
        registerMarkerBuilder(Silverfish.class, new SilverfishMarkerBuilder());
        registerMarkerBuilder(Spider.class, new SpiderMarkerBuilder());
        registerMarkerBuilder(Vex.class, new VexMarkerBuilder());
        registerMarkerBuilder(Warden.class, new WardenMarkerBuilder());
        registerMarkerBuilder(Wither.class, new WitherMarkerBuilder());
        registerMarkerBuilder(Zoglin.class, new ZoglinMarkerBuilder());
        registerMarkerBuilder(Zombie.class, new ZombieMarkerBuilder());
    }
}
