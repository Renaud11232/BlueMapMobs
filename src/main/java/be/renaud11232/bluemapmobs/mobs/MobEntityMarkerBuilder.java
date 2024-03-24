package be.renaud11232.bluemapmobs.mobs;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Mob;

import java.util.Optional;

public interface MobEntityMarkerBuilder<T extends Mob> extends MarkerBuilder<T> {

    @Override
    default Optional<POIMarker> build(T mob) {
        return MarkerBuilder.super.build(mob).map(marker ->  {
            marker.setPosition(mob.getX(), mob.getY() + mob.getEyeHeight(), mob.getZ());
            return marker;
        });
    }

}
