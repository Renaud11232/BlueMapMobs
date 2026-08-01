package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.module.SimpleModule;
import be.renaud11232.bluemapmobs.entity.Mob;
import be.renaud11232.bluemapmobs.markerbuilder.MobsMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;

public abstract class MobsModule<WORLD_TYPE, SOURCE_ENTITY_TYPE> extends SimpleModule<WORLD_TYPE, SOURCE_ENTITY_TYPE, Mob> {
    protected MobsModule(BlueMapAPI api, Configuration configuration, EntityConverter<SOURCE_ENTITY_TYPE, Mob> converter) {
        super(api, configuration, converter, new MobsMarkerBuilder(api, configuration));
    }

    @Override
    public String getModuleIdentifier() {
        return "bluemap-mobs";
    }
}
