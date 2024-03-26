package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sniffer;

import java.util.Optional;

public class SnifferMarkerBuilder extends MobEntityMarkerBuilder<Sniffer> {

    public SnifferMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Sniffer mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
