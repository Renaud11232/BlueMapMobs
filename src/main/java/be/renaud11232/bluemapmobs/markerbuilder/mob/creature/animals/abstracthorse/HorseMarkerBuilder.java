package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Horse;

import java.util.Optional;

public class HorseMarkerBuilder extends MobEntityMarkerBuilder<Horse> {

    public HorseMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Horse mob) {
        //TODO
        return super.buildDefault(mob);
    }
}