package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Endermite;

import java.util.Optional;

public class EndermiteMarkerBuilder extends MobEntityMarkerBuilder<Endermite> {

    public EndermiteMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Endermite mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
