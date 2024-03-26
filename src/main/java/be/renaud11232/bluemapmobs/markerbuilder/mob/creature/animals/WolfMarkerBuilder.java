package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.Optional;

public class WolfMarkerBuilder extends MobEntityMarkerBuilder<Wolf> {

    public WolfMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Wolf mob) {
        //TODO
        return super.buildDefault(mob);
    }
}