package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.entity.Mob;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.Optional;

public abstract class MobSingleVariantMarkerBuilder<T extends Mob, VARIANT> extends SimpleSingleVariantMarkerBuilder<T, VARIANT> {
    public MobSingleVariantMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    public Optional<POIMarker> build(T entity) {
        return super.build(entity).map(marker -> MobMarkerBuilder.updateMobMarker(entity, marker));
    }
}
