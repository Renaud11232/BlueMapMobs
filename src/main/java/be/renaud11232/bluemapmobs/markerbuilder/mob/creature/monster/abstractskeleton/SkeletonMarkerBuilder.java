package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Skeleton;

import java.util.Optional;

public class SkeletonMarkerBuilder extends MobEntityMarkerBuilder<Skeleton> {

    public SkeletonMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Skeleton mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
