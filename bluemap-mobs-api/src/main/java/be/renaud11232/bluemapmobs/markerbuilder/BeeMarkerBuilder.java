package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Bee;

import java.util.List;

public class BeeMarkerBuilder extends AgeableVariantMarkerBuilder<Bee, Boolean, Boolean> {
    public BeeMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(true, MobsIcon.BEE_NECTAR);
        registerVariantAdultIcon(false, MobsIcon.BEE_NO_NECTAR);
        registerVariantAdultStyleClasses(true, List.of(MobsStyleClass.BEE_ANGRY));
        registerVariantAdultStyleClasses(false, List.of(MobsStyleClass.BEE));
        registerVariantBabyIcon(true, MobsIcon.BEE_BABY_NECTAR);
        registerVariantBabyIcon(false, MobsIcon.BEE_BABY_NO_NECTAR);
        registerVariantBabyStyleClasses(true, List.of(MobsStyleClass.BEE_BABY_ANGRY));
        registerVariantBabyStyleClasses(false, List.of(MobsStyleClass.BEE_BABY));
    }

    @Override
    protected Boolean getIconVariant(Bee bee) {
        return bee.hasNectar();
    }

    @Override
    protected Boolean getStyleClassesVariant(Bee bee) {
        return bee.getAnger() > 0;
    }
}
