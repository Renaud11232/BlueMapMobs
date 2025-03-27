package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;

public class CaveSpiderMarkerBuilder extends MobEntityMarkerBuilder<CaveSpider> {
    public CaveSpiderMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CAVE_SPIDER, BlueMapMobsIcon.Mob.CAVE_SPIDER);
    }
}
