package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Bee;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.List;

public class BeeMarkerBuilder extends AgeableVariantMarkerBuilder<Bee, Boolean, Boolean> {
    public BeeMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(true, MobIcon.BEE_NECTAR);
        registerVariantAdultIcon(false, MobIcon.BEE_NECTAR_NONE);
        registerVariantAdultStyleClasses(true, List.of(MobStyleClass.BEE_ANGRY));
        registerVariantAdultStyleClasses(false, List.of(MobStyleClass.BEE));
        registerVariantBabyIcon(true, MobIcon.BEE_NECTAR_BABY);
        registerVariantBabyIcon(false, MobIcon.BEE_NECTAR_NONE_BABY);
        registerVariantBabyStyleClasses(true, List.of(MobStyleClass.BEE_ANGRY_BABY));
        registerVariantBabyStyleClasses(false, List.of(MobStyleClass.BEE_BABY));
    }

    @Override
    protected Boolean getIconVariant(Bee bee) {
        return bee.hasNectar();
    }

    @Override
    protected Boolean getStyleClassesVariant(Bee bee) {
        return bee.isAngry();
    }
}
