package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.spider.CaveSpiderMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Spider;

public class SpiderMarkerBuilder extends MobEntityMarkerBuilder<Spider> {
    public SpiderMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SPIDER;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Spider> registry) {
        registry.register(CaveSpider.class, new CaveSpiderMarkerBuilder(getConfig(), getDefaultConfig()));
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.SPIDER;
    }
}
