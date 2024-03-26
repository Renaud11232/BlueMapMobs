package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Snowman;

import java.util.Optional;

public class SnowmanMarkerBuilder extends MobEntityMarkerBuilder<Snowman> {

    public SnowmanMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Snowman mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
