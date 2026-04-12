package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.module.SimpleModule;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import be.renaud11232.bluemapmobs.entity.Mob;
import be.renaud11232.bluemapmobs.markerbuilder.MobsMarkerBuilder;

public abstract class MobsModule<T> extends SimpleModule<T, Mob> {
    protected MobsModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<T, Mob> converter) {
        super(api, configuration, converter, new MobsMarkerBuilder(api));
    }

    @Override
    public String getAssetDirectoryName() {
        return "assets";
    }

    @Override
    public String getModuleIdentifier() {
        return "mobs";
    }
}
