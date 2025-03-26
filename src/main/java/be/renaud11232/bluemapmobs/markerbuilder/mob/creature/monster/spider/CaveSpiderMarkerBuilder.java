package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;

public class CaveSpiderMarkerBuilder extends SingleIconMobEntityMarkerBuilder<CaveSpider> {
    public CaveSpiderMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.cave_spider", Icon.CAVE_SPIDER);
    }
}
