package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Camel;

public class CamelMarkerBuilder extends MobEntityMarkerBuilder<Camel> {
    public CamelMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.CAMEL, MobIcon.CAMEL);
    }
}
