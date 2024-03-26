package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider.CaveSpiderMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Spider;

import java.util.Optional;

public class SpiderMarkerBuilder extends MobEntityMarkerBuilder<Spider> {
    public SpiderMarkerBuilder() {
        registerMarkerBuilder(CaveSpider.class, new CaveSpiderMarkerBuilder());
    }

    @Override
    public Optional<POIMarker> buildDefault(Spider mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
