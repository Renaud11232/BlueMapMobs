package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class MonsterMarkerBuilder extends AbstractMobMarkerBuilder<Monster> {
    public MonsterMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Monster> registry) {
        registry.register(AbstractSkeleton.class, new AbstractSkeletonMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Blaze.class, new BlazeMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Breeze.class, new BreezeMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Creaking.class, new CreakingMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Creeper.class, new CreeperMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Enderman.class, new EndermanMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Endermite.class, new EndermiteMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Giant.class, new GiantMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Guardian.class, new GuardianMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(PiglinAbstract.class, new PiglinAbstractMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Raider.class, new RaiderMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Silverfish.class, new SilverfishMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Spider.class, new SpiderMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Vex.class, new VexMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Warden.class, new WardenMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Wither.class, new WitherMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Zoglin.class, new ZoglinMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Zombie.class, new ZombieMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
