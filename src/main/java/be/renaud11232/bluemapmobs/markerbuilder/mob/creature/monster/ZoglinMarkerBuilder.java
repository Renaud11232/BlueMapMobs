package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Zoglin;

public class ZoglinMarkerBuilder extends MobEntityMarkerBuilder<Zoglin> {
    public ZoglinMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ZOGLIN, MobIcon.ZOGLIN);
    }
}
