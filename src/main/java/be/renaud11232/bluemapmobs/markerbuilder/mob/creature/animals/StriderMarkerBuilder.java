package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Strider;

import java.util.Optional;

public class StriderMarkerBuilder extends MobEntityMarkerBuilder<Strider> {

    public StriderMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Strider mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
