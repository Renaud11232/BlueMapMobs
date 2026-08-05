package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Strider;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class StriderMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Strider, Boolean> {
    public StriderMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(false, MobIcon.STRIDER);
        registerVariantAdultIcon(true, MobIcon.STRIDER_COLD);
        registerVariantBabyIcon(false, MobIcon.STRIDER_BABY);
        registerVariantBabyIcon(true, MobIcon.STRIDER_COLD_BABY);
    }

    @Override
    protected Boolean getVariant(Strider strider) {
        return strider.isShivering();
    }
}
