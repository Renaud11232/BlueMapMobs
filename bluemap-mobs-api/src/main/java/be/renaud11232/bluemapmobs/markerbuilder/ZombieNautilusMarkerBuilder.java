package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.ZombieNautilus;

public class ZombieNautilusMarkerBuilder extends MobSingleVariantMarkerBuilder<ZombieNautilus, ZombieNautilus.Variant> {
    public ZombieNautilusMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(ZombieNautilus.Variant.TEMPERATE, MobsIcon.ZOMBIE_NAUTILUS_TEMPERATE);
        registerVariantIcon(ZombieNautilus.Variant.WARM, MobsIcon.ZOMBIE_NAUTILUS_WARM);
    }

    @Override
    protected ZombieNautilus.Variant getVariant(ZombieNautilus zombieNautilus) {
        return zombieNautilus.getVariant();
    }
}
