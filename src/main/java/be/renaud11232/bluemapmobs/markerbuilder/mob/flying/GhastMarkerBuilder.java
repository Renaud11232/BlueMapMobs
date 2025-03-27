package be.renaud11232.bluemapmobs.markerbuilder.mob.flying;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Ghast;

public class GhastMarkerBuilder extends MobEntityMarkerBuilder<Ghast> {
    public GhastMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.GHAST, MobIcon.GHAST);
    }
}
