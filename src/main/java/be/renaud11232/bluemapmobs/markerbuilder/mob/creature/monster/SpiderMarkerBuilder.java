package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider.CaveSpiderMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Spider;

public class SpiderMarkerBuilder extends MobEntityMarkerBuilder<Spider> {
    public SpiderMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SPIDER, BlueMapMobsIcon.Mob.SPIDER);
        registerMarkerBuilder(CaveSpider.class, new CaveSpiderMarkerBuilder(config));
    }
}
