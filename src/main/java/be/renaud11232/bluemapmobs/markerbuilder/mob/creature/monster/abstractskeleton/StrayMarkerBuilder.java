package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Stray;

public class StrayMarkerBuilder extends MobEntityMarkerBuilder<Stray> {
    public StrayMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.STRAY, MobIcon.STRAY);
    }
}
