package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.ZombieNautilus;

public class ZombieNautilusMarkerBuilder extends SimpleSingleVariantMarkerBuilder<ZombieNautilus, ZombieNautilus.Variant> {
    public ZombieNautilusMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(ZombieNautilus.Variant.TEMPERATE, MobsIcon.TEMPERATE_ZOMBIE_NAUTILUS);
        registerVariantIcon(ZombieNautilus.Variant.WARM, MobsIcon.WARM_ZOMBIE_NAUTILUS);
    }

    @Override
    protected ZombieNautilus.Variant getVariant(ZombieNautilus zombieNautilus) {
        return zombieNautilus.getVariant();
    }
}
