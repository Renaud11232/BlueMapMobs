package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creaking;

public class CreakingMarkerBuilder extends MobEntityMarkerBuilder<Creaking> {
    public CreakingMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.CREAKING, MobIcon.CREAKING);
    }
}
