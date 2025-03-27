package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Strider;

public class StriderMarkerBuilder extends MobEntityMarkerBuilder<Strider> {
    public StriderMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.STRIDER, MobIcon.STRIDER);
    }
}
