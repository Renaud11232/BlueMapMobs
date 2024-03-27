package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider.CaveSpiderMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Spider;

import java.util.Optional;

public class SpiderMarkerBuilder extends MobEntityMarkerBuilder<Spider> {
    public SpiderMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(CaveSpider.class, new CaveSpiderMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Spider mob) {
        //TODO
        return super.buildDefault(mob);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.spider", true);
    }
}
