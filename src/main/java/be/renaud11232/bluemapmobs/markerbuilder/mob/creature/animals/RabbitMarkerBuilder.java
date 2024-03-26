package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Rabbit;

import java.util.Optional;

public class RabbitMarkerBuilder extends MobEntityMarkerBuilder<Rabbit> {

    public RabbitMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Rabbit mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
