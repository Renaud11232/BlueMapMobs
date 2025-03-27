package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

public class FishMarkerBuilder extends MobEntityMarkerBuilder<Fish> {
    public FishMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Cod.class, new CodMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(PufferFish.class, new PufferFishMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Salmon.class, new SalmonMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Tadpole.class, new TadpoleMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(TropicalFish.class, new TropicalFishMarkerBuilder(config, defaultConfig));
    }
}
