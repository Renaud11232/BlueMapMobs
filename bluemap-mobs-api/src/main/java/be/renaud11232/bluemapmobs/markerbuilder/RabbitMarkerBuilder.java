package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Rabbit;

public class RabbitMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Rabbit.Type.GOLD, MobsIcon.GOLD_RABBIT);
        registerVariantAdultIcon(Rabbit.Type.WHITE, MobsIcon.WHITE_RABBIT);
        registerVariantAdultIcon(Rabbit.Type.BLACK_AND_WHITE, MobsIcon.WHITE_SPLOTCHED_RABBIT);
        registerVariantAdultIcon(Rabbit.Type.BLACK, MobsIcon.BLACK_RABBIT);
        registerVariantAdultIcon(Rabbit.Type.BROWN, MobsIcon.BROWN_RABBIT);
        registerVariantAdultIcon(Rabbit.Type.SALT_AND_PEPPER, MobsIcon.SALT_RABBIT);
        registerVariantAdultIcon(Rabbit.Type.THE_KILLER_BUNNY, MobsIcon.CAERBANNOG_RABBIT);
        //TODO: Baby variants
    }

    @Override
    protected Rabbit.Type getVariant(Rabbit rabbit) {
        return rabbit.getType();
    }

    @Override
    protected Icon getAdultIcon(Rabbit rabbit) {
        if (rabbit.getName().equals("Toast")) {
            return MobsIcon.TOAST_RABBIT;
        }
        return super.getAdultIcon(rabbit);
    }

    @Override
    protected Icon getBabyIcon(Rabbit rabbit) {
        //TODO Toast baby variant
        return super.getBabyIcon(rabbit);
    }
}
