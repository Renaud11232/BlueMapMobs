package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;

public class CaveSpiderMarkerBuilder extends MobEntityMarkerBuilder<CaveSpider> {
    public CaveSpiderMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.CAVE_SPIDER, MobIcon.CAVE_SPIDER);
    }
}
