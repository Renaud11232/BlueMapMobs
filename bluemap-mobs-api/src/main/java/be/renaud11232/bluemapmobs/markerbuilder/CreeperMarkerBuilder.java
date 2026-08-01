package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Creeper;

public class CreeperMarkerBuilder extends MobSingleVariantMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(true, MobsIcon.CREEPER_CHARGED);
        registerVariantIcon(false, MobsIcon.CREEPER);
    }

    @Override
    protected Boolean getVariant(Creeper creeper) {
        return creeper.isPowered();
    }
}
