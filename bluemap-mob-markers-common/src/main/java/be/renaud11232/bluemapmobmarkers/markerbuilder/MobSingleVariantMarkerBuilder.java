package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobmarkers.entity.Mob;
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
