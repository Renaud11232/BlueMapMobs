package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Mob;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.List;
import java.util.Optional;

public abstract class MobMarkerBuilder<T extends Mob> extends SimpleMarkerBuilder<T> {
    public MobMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    static POIMarker updateMobMarker(Mob mob, POIMarker marker) {
        if (mob.getName().equals("Dinnerbone") || mob.getName().equals("Grumm")) {
            marker.addStyleClasses(List.of(MobStyleClass.FLIP));
        }
        return marker;
    }

    @Override
    public Optional<POIMarker> build(T entity) {
        return super.build(entity).map(marker -> updateMobMarker(entity, marker));
    }
}
