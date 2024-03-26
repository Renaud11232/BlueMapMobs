package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Tadpole;

import java.util.Optional;

public class TadpoleMarkerBuilder extends MobEntityMarkerBuilder<Tadpole> {

    public TadpoleMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Tadpole mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
