package be.renaud11232.bluemapmobs.markerbuilder.mob.ambient;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bat;

import java.util.Optional;

public class BatMarkerBuilder extends MobEntityMarkerBuilder<Bat> {

    public BatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Bat mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
