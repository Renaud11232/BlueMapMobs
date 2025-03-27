package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AnimalsMarkerBuilder extends MobEntityMarkerBuilder<Animals> {
    public AnimalsMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(AbstractCow.class, new AbstractCowMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(AbstractHorse.class, new AbstractHorseMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Armadillo.class, new ArmadilloMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Axolotl.class, new AxolotlMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Bee.class, new BeeMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Cat.class, new CatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Chicken.class, new ChickenMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Fox.class, new FoxMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Frog.class, new FrogMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Goat.class, new GoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Hoglin.class, new HoglinMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Ocelot.class, new OcelotMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Panda.class, new PandaMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Parrot.class, new ParrotMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Pig.class, new PigMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(PolarBear.class, new PolarBearMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Rabbit.class, new RabbitMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Sheep.class, new SheepMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Sniffer.class, new SnifferMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Strider.class, new StriderMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Turtle.class, new TurtleMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Wolf.class, new WolfMarkerBuilder(config, defaultConfig));
    }
}
