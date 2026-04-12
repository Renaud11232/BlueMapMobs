package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Creeper;

public class CreeperMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Boolean getVariant(Creeper creeper) {
        return creeper.isPowered();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(true, MobsIcon.CHARGED_CREEPER);
        registerVariantIcon(false, MobsIcon.CREEPER);
    }
}
