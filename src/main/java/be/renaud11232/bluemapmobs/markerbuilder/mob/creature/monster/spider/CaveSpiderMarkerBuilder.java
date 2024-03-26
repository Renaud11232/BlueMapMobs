package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.spider;

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
        //TODO
        return super.buildDefault(mob);
    }
}
