package be.renaud11232.bluemapmobs.livingentities;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.LivingEntity;

import java.util.Optional;

public class LivingEntityMarkerBuilder implements MarkerBuilder<LivingEntity> {
    @Override
    public Optional<Marker> build(LivingEntity livingEntity) {
        return Optional.of(
                POIMarker.builder()
                        .label(livingEntity.getName())
                        .position(livingEntity.getX(), livingEntity.getY() + livingEntity.getEyeHeight(), livingEntity.getZ())
                        .maxDistance(1000)
                        .build()
        );
    }
}
