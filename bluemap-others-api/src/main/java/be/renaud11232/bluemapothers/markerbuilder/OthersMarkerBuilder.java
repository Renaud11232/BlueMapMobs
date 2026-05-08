package be.renaud11232.bluemapothers.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapentities.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothers.entity.ArmorStand;
import be.renaud11232.bluemapothers.entity.Mannequin;

public class OthersMarkerBuilder extends SimpleMarkerBuilder<Entity> {
    public OthersMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        register(ArmorStand.class, new ArmorStandMarkerBuilder(getAPI()));
        register(Mannequin.class, new MannequinMarkerBuilder(getAPI()));

        register(UnknownEntity.class, new EmptyMarkerBuilder<>());
    }
}
