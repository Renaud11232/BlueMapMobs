package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.ZombieNautilus;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ZombieNautilusMarkerBuilder extends MobSingleVariantMarkerBuilder<ZombieNautilus, ZombieNautilus.Variant> {
    public ZombieNautilusMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(ZombieNautilus.Variant.TEMPERATE, MobIcon.ZOMBIE_NAUTILUS_TEMPERATE);
        registerVariantIcon(ZombieNautilus.Variant.WARM, MobIcon.ZOMBIE_NAUTILUS_WARM);
    }

    @Override
    protected ZombieNautilus.Variant getVariant(ZombieNautilus zombieNautilus) {
        return zombieNautilus.getVariant();
    }
}
