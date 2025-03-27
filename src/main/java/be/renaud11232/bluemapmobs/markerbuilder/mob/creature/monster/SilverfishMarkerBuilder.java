package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Silverfish;

public class SilverfishMarkerBuilder extends MobEntityMarkerBuilder<Silverfish> {
    public SilverfishMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SILVERFISH, MobIcon.SILVERFISH);
    }
}
