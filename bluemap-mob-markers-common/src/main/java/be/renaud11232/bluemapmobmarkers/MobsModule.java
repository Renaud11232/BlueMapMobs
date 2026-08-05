package be.renaud11232.bluemapmobmarkers;

import be.renaud11232.bluemapentitymarkers.EntityConverter;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.module.SimpleModule;
import be.renaud11232.bluemapmobmarkers.entity.Mob;
import be.renaud11232.bluemapmobmarkers.markerbuilder.MobsMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;

public abstract class MobsModule<WORLD_TYPE, SOURCE_ENTITY_TYPE> extends SimpleModule<WORLD_TYPE, SOURCE_ENTITY_TYPE, Mob> {
    protected MobsModule(BlueMapAPI api, Configuration configuration, EntityConverter<SOURCE_ENTITY_TYPE, Mob> converter) {
        super(api, configuration, converter, new MobsMarkerBuilder(api, configuration));
    }

    @Override
    public String getModuleIdentifier() {
        return "bluemap-mob-markers";
    }
}
