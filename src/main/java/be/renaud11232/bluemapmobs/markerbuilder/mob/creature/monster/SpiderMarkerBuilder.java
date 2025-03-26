package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider.CaveSpiderMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Spider;

public class SpiderMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Spider> {
    public SpiderMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.spider", Icon.SPIDER);
        registerMarkerBuilder(CaveSpider.class, new CaveSpiderMarkerBuilder(config));
    }
}
