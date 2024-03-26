package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class FishMarkerBuilder extends MobEntityMarkerBuilder<Fish> {
    public FishMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Cod.class, new CodMarkerBuilder(config));
        registerMarkerBuilder(PufferFish.class, new PufferFishMarkerBuilder(config));
        registerMarkerBuilder(Salmon.class, new SalmonMarkerBuilder(config));
        registerMarkerBuilder(Tadpole.class, new TadpoleMarkerBuilder(config));
        registerMarkerBuilder(TropicalFish.class, new TropicalFishMarkerBuilder(config));
    }
}
