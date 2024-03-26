package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.cow;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MushroomCow;

import java.util.Optional;

public class MushroomCowMarkerBuilder extends MobEntityMarkerBuilder<MushroomCow> {

    public MushroomCowMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(MushroomCow mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
