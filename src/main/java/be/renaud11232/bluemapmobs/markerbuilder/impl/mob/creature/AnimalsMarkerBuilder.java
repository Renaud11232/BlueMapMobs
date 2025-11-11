package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.*;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AnimalsMarkerBuilder extends AbstractMobMarkerBuilder<Animals> {
    public AnimalsMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Animals> registry) {
        registry.register(AbstractCow.class, new AbstractCowMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(AbstractHorse.class, new AbstractHorseMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Armadillo.class, new ArmadilloMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Axolotl.class, new AxolotlMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Bee.class, new BeeMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Cat.class, new CatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Chicken.class, new ChickenMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Fox.class, new FoxMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Frog.class, new FrogMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Goat.class, new GoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(HappyGhast.class, new HappyGhastMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Hoglin.class, new HoglinMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Ocelot.class, new OcelotMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Panda.class, new PandaMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Parrot.class, new ParrotMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Pig.class, new PigMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(PolarBear.class, new PolarBearMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Rabbit.class, new RabbitMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Sheep.class, new SheepMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Sniffer.class, new SnifferMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Strider.class, new StriderMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Turtle.class, new TurtleMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Wolf.class, new WolfMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
