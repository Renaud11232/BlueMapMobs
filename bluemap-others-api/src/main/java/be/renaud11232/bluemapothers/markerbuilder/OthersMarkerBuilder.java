package be.renaud11232.bluemapothers.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapentities.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothers.entity.ArmorStand;
import be.renaud11232.bluemapothers.entity.Mannequin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class OthersMarkerBuilder extends SimpleMarkerBuilder<Entity> {
    public OthersMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        register(ArmorStand.class, new ArmorStandMarkerBuilder(getAPI(), getConfiguration()));
        register(Mannequin.class, new MannequinMarkerBuilder(getAPI(), getConfiguration()));

        register(UnknownEntity.class, new EmptyMarkerBuilder<>());
    }
}
