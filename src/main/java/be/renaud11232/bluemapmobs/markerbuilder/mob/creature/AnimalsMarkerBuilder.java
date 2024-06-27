package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class AnimalsMarkerBuilder extends MobEntityMarkerBuilder<Animals> {
    public AnimalsMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(AbstractHorse.class, new AbstractHorseMarkerBuilder(config));
        registerMarkerBuilder(Armadillo.class, new ArmadilloMarkerBuilder(config));
        registerMarkerBuilder(Axolotl.class, new AxolotlMarkerBuilder(config));
        registerMarkerBuilder(Bee.class, new BeeMarkerBuilder(config));
        registerMarkerBuilder(Cat.class, new CatMarkerBuilder(config));
        registerMarkerBuilder(Chicken.class, new ChickenMarkerBuilder(config));
        registerMarkerBuilder(Cow.class, new CowMarkerBuilder(config));
        registerMarkerBuilder(Fox.class, new FoxMarkerBuilder(config));
        registerMarkerBuilder(Frog.class, new FrogMarkerBuilder(config));
        registerMarkerBuilder(Goat.class, new GoatMarkerBuilder(config));
        registerMarkerBuilder(Hoglin.class, new HoglinMarkerBuilder(config));
        registerMarkerBuilder(Ocelot.class, new OcelotMarkerBuilder(config));
        registerMarkerBuilder(Panda.class, new PandaMarkerBuilder(config));
        registerMarkerBuilder(Parrot.class, new ParrotMarkerBuilder(config));
        registerMarkerBuilder(Pig.class, new PigMarkerBuilder(config));
        registerMarkerBuilder(PolarBear.class, new PolarBearMarkerBuilder(config));
        registerMarkerBuilder(Rabbit.class, new RabbitMarkerBuilder(config));
        registerMarkerBuilder(Sheep.class, new SheepMarkerBuilder(config));
        registerMarkerBuilder(Sniffer.class, new SnifferMarkerBuilder(config));
        registerMarkerBuilder(Strider.class, new StriderMarkerBuilder(config));
        registerMarkerBuilder(Turtle.class, new TurtleMarkerBuilder(config));
        registerMarkerBuilder(Wolf.class, new WolfMarkerBuilder(config));
    }
}
