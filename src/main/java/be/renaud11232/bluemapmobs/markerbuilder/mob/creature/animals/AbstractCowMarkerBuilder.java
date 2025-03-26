package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow.CowMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow.MushroomCowMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractCow;
import org.bukkit.entity.Cow;
import org.bukkit.entity.MushroomCow;

public class AbstractCowMarkerBuilder extends MobEntityMarkerBuilder<AbstractCow> {
    public AbstractCowMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Cow.class, new CowMarkerBuilder(config));
        registerMarkerBuilder(MushroomCow.class, new MushroomCowMarkerBuilder(config));
    }
}
