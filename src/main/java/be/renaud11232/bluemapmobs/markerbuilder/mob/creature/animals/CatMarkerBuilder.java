package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

import java.util.Optional;

public class CatMarkerBuilder extends MobEntityMarkerBuilder<Cat> {

    public CatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Cat mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
