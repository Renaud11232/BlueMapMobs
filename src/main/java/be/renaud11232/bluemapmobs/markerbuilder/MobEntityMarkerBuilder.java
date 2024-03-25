package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.markerbuilder.EntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Mob;

import java.util.Optional;

public abstract class MobEntityMarkerBuilder<T extends Mob> extends EntityMarkerBuilder<T> {

    @Override
    public Optional<POIMarker> buildDefault(T mob) {
        return super.buildDefault(mob).map(marker ->  {
            marker.setPosition(mob.getX(), mob.getY() + mob.getEyeHeight(), mob.getZ());
            return marker;
        });
    }

}
