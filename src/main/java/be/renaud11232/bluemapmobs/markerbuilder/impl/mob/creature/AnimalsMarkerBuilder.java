package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AnimalsMarkerBuilder extends MobEntityMarkerBuilder<Animals> {
    public AnimalsMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Animals> registry) {
        registry.register(AbstractCow.class, new AbstractCowMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(AbstractHorse.class, new AbstractHorseMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Armadillo.class, new ArmadilloMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Axolotl.class, new AxolotlMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Bee.class, new BeeMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Cat.class, new CatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Chicken.class, new ChickenMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Fox.class, new FoxMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Frog.class, new FrogMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Goat.class, new GoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Hoglin.class, new HoglinMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Ocelot.class, new OcelotMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Panda.class, new PandaMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Parrot.class, new ParrotMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Pig.class, new PigMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(PolarBear.class, new PolarBearMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Rabbit.class, new RabbitMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Sheep.class, new SheepMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Sniffer.class, new SnifferMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Strider.class, new StriderMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Turtle.class, new TurtleMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Wolf.class, new WolfMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
