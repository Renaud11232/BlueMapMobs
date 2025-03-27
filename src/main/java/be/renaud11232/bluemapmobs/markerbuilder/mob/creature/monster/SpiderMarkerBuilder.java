package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider.CaveSpiderMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Spider;

public class SpiderMarkerBuilder extends MobEntityMarkerBuilder<Spider> {
    public SpiderMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SPIDER, MobIcon.SPIDER);
        registerMarkerBuilder(CaveSpider.class, new CaveSpiderMarkerBuilder(config));
    }
}
