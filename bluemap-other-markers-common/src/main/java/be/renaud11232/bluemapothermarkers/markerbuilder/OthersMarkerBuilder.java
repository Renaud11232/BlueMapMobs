package be.renaud11232.bluemapothermarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.entity.Entity;
import be.renaud11232.bluemapentitymarkers.entity.UnknownEntity;
import be.renaud11232.bluemapentitymarkers.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapothermarkers.entity.ArmorStand;
import be.renaud11232.bluemapothermarkers.entity.Mannequin;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class OthersMarkerBuilder extends SimpleMarkerBuilder<Entity> {
    public OthersMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        register(ArmorStand.class, new ArmorStandMarkerBuilder(getAPI(), getConfiguration()));
        register(Mannequin.class, new MannequinMarkerBuilder(getAPI(), getConfiguration()));

        register(UnknownEntity.class, new EmptyMarkerBuilder<>());
    }
}
