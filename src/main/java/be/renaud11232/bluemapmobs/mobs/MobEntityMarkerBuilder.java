package be.renaud11232.bluemapmobs.mobs;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import org.bukkit.entity.LivingEntity;

import java.util.Optional;

public interface MobEntityMarkerBuilder<T extends LivingEntity> extends MarkerBuilder<T> {

    @Override
    default Optional<Marker> build(T livingEntity) {
        return MarkerBuilder.super.build(livingEntity).map(marker ->  {
            marker.setPosition(livingEntity.getX(), livingEntity.getY() + livingEntity.getEyeHeight(), livingEntity.getZ());
            return marker;
        });
    }

    @Override
    default String getAsset(String file) {
        return MarkerBuilder.super.getAsset("mobs/" + file);
    }

}
