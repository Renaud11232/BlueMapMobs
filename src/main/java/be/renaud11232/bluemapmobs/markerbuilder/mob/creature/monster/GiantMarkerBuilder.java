package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Giant;

import java.util.Optional;

public class GiantMarkerBuilder extends MobEntityMarkerBuilder<Giant> {

    public GiantMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Giant mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
