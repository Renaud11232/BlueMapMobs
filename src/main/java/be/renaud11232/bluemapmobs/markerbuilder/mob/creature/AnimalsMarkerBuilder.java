package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.*;
import org.bukkit.entity.*;

public class AnimalsMarkerBuilder extends MobEntityMarkerBuilder<Animals> {
    public AnimalsMarkerBuilder() {
        registerMarkerBuilder(AbstractHorse.class, new AbstractHorseMarkerBuilder());
        registerMarkerBuilder(Axolotl.class, new AxolotlMarkerBuilder());
        registerMarkerBuilder(Bee.class, new BeeMarkerBuilder());
        registerMarkerBuilder(Cat.class, new CatMarkerBuilder());
        registerMarkerBuilder(Chicken.class, new ChickenMarkerBuilder());
        registerMarkerBuilder(Cow.class, new CowMarkerBuilder());
        registerMarkerBuilder(Fox.class, new FoxMarkerBuilder());
        registerMarkerBuilder(Frog.class, new FrogMarkerBuilder());
        registerMarkerBuilder(Goat.class, new GoatMarkerBuilder());
        registerMarkerBuilder(Hoglin.class, new HoglinMarkerBuilder());
        registerMarkerBuilder(Ocelot.class, new OcelotMarkerBuilder());
        registerMarkerBuilder(Panda.class, new PandaMarkerBuilder());
        registerMarkerBuilder(Parrot.class, new ParrotMarkerBuilder());
        registerMarkerBuilder(Pig.class, new PigMarkerBuilder());
        registerMarkerBuilder(PolarBear.class, new PolarBearMarkerBuilder());
        registerMarkerBuilder(Rabbit.class, new RabbitMarkerBuilder());
        registerMarkerBuilder(Sheep.class, new SheepMarkerBuilder());
        registerMarkerBuilder(Sniffer.class, new SnifferMarkerBuilder());
        registerMarkerBuilder(Strider.class, new StriderMarkerBuilder());
        registerMarkerBuilder(Turtle.class, new TurtleMarkerBuilder());
        registerMarkerBuilder(Wolf.class, new WolfMarkerBuilder());
    }
}
