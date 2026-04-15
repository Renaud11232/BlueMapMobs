package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Strider;

public class StriderMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Strider, Boolean> {
    public StriderMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(false, MobsIcon.STRIDER);
        //TODO: add shivering icon
        //TODO: add baby variants
    }

    @Override
    protected Boolean getVariant(Strider strider) {
        return strider.isShivering();
    }
}
