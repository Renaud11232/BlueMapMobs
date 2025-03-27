package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bee;

public class BeeMarkerBuilder extends MobEntityMarkerBuilder<Bee> {
    public BeeMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.BEE, MobIcon.BEE);
    }
}
