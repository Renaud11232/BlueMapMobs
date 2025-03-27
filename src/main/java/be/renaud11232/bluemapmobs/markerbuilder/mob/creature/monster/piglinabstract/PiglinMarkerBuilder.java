package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Piglin;

public class PiglinMarkerBuilder extends MobEntityMarkerBuilder<Piglin> {
    public PiglinMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.PIGLIN, MobIcon.PIGLIN);
    }
}
