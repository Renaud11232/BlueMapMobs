package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Creeper;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class CreeperMarkerBuilder extends MobSingleVariantMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(true, MobIcon.CREEPER_CHARGED);
        registerVariantIcon(false, MobIcon.CREEPER);
    }

    @Override
    protected Boolean getVariant(Creeper creeper) {
        return creeper.isPowered();
    }
}
