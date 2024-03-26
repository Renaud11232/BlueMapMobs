package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.WitherSkeleton;

import java.util.Optional;

public class WitherSkeletonMarkerBuilder extends MobEntityMarkerBuilder<WitherSkeleton> {

    public WitherSkeletonMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(WitherSkeleton mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
