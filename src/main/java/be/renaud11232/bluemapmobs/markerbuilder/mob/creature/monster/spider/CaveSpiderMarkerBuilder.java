package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.CaveSpider;

import java.util.Optional;

public class CaveSpiderMarkerBuilder extends MobEntityMarkerBuilder<CaveSpider> {

    public CaveSpiderMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(CaveSpider mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.CAVE_SPIDER.getPath(), Icon.CAVE_SPIDER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.cave_spider", true);
    }
}
