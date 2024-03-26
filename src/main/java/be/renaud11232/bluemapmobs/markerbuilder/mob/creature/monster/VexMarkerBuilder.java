package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vex;

import java.util.Optional;

public class VexMarkerBuilder extends MobEntityMarkerBuilder<Vex> {

    public VexMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Vex mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
