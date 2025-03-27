package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Allay;

public class AllayMarkerBuilder extends MobEntityMarkerBuilder<Allay> {
    public AllayMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ALLAY, MobIcon.ALLAY);
    }
}
