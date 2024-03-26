package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wither;

import java.util.Optional;

public class WitherMarkerBuilder extends MobEntityMarkerBuilder<Wither> {

    public WitherMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Wither mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
