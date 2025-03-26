package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Zoglin;

public class ZoglinMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Zoglin> {
    public ZoglinMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.zoglin", Icon.ZOGLIN);
    }
}
