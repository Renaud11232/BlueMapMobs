package be.renaud11232.bluemapmobs.mobs;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.LivingEntity;

import java.util.Optional;

public interface MobEntityMarkerBuilder<T extends LivingEntity> extends MarkerBuilder<T> {

    @Override
    default Optional<POIMarker> build(T livingEntity) {
        return MarkerBuilder.super.build(livingEntity).map(marker ->  {
            marker.setPosition(livingEntity.getX(), livingEntity.getY() + livingEntity.getEyeHeight(), livingEntity.getZ());
            return marker;
        });
    }

}
