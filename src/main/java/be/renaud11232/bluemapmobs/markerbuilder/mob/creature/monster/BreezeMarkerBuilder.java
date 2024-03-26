package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Breeze;

import java.util.Optional;

public class BreezeMarkerBuilder extends MobEntityMarkerBuilder<Breeze> {

    public BreezeMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Breeze mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
