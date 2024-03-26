package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.piglinabstract;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PiglinBrute;

import java.util.Optional;

public class PiglinBruteMarkerBuilder extends MobEntityMarkerBuilder<PiglinBrute> {

    public PiglinBruteMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PiglinBrute mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
