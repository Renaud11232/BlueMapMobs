package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Snowman;

public class SnowmanMarkerBuilder extends MobEntityMarkerBuilder<Snowman> {
    public SnowmanMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SNOWMAN, MobIcon.SNOWMAN);
    }
}
