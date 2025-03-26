package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Piglin;

public class PiglinMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Piglin> {
    public PiglinMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.piglin", Icon.PIGLIN);
    }
}
