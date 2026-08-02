package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.entity.Mob;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.Optional;

public abstract class MobSingleVariantMarkerBuilder<T extends Mob, VARIANT> extends SimpleSingleVariantMarkerBuilder<T, VARIANT> {
    public MobSingleVariantMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    public Optional<POIMarker> build(T entity) {
        return super.build(entity).map(marker -> MobMarkerBuilder.updateMobMarker(entity, marker));
    }
}
