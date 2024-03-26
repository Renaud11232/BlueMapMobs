package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.fish;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cod;

import java.util.Optional;

public class CodMarkerBuilder extends MobEntityMarkerBuilder<Cod> {

    public CodMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Cod mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
