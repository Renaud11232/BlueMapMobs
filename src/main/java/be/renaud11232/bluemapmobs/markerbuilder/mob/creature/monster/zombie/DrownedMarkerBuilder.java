package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Drowned;

import java.util.Optional;

public class DrownedMarkerBuilder extends MobEntityMarkerBuilder<Drowned> {

    public DrownedMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Drowned mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
