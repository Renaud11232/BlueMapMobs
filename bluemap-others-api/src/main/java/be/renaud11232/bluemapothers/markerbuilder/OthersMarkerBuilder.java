package be.renaud11232.bluemapothers.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.DefaultMarkerType;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothers.OthersMarkerType;

public class OthersMarkerBuilder extends SimpleMarkerBuilder<Entity> {
    public OthersMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        register(OthersMarkerType.ARMOR_STAND, new ArmorStandMarkerBuilder(getAPI()));
        register(OthersMarkerType.MANNEQUIN, new MannequinMarkerBuilder(getAPI()));

        register(DefaultMarkerType.UNKNOWN, new EmptyMarkerBuilder<>());
    }
}
