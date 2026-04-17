package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.ZombieNautilus;

public class ZombieNautilusMarkerBuilder extends MobSingleVariantMarkerBuilder<ZombieNautilus, ZombieNautilus.Variant> {
    public ZombieNautilusMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(ZombieNautilus.Variant.TEMPERATE, MobsIcon.ZOMBIE_NAUTILUS_TEMPERATE);
        registerVariantIcon(ZombieNautilus.Variant.WARM, MobsIcon.ZOMBIE_NAUTILUS_WARM);
    }

    @Override
    protected ZombieNautilus.Variant getVariant(ZombieNautilus zombieNautilus) {
        return zombieNautilus.getVariant();
    }
}
