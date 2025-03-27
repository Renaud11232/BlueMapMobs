package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Giant;

public class GiantMarkerBuilder extends MobEntityMarkerBuilder<Giant> {
    public GiantMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.GIANT, MobIcon.GIANT);
    }
}
