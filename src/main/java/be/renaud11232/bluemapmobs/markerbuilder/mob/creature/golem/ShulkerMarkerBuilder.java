package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Shulker;

public class ShulkerMarkerBuilder extends MobEntityMarkerBuilder<Shulker> {
    public ShulkerMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SHULKER, MobIcon.SHULKER);
    }
}
