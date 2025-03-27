package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Witch;

public class WitchMarkerBuilder extends MobEntityMarkerBuilder<Witch> {
    public WitchMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.WITCH, MobIcon.WITCH);
    }
}
