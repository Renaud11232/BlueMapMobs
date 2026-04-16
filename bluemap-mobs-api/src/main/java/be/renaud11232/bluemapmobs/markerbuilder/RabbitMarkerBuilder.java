package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Rabbit;

public class RabbitMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Rabbit.Type.GOLD, MobsIcon.RABBIT_GOLD);
        registerVariantAdultIcon(Rabbit.Type.WHITE, MobsIcon.RABBIT_WHITE);
        registerVariantAdultIcon(Rabbit.Type.BLACK_AND_WHITE, MobsIcon.RABBIT_BLACK_AND_WHITE);
        registerVariantAdultIcon(Rabbit.Type.BLACK, MobsIcon.RABBIT_BLACK);
        registerVariantAdultIcon(Rabbit.Type.BROWN, MobsIcon.RABBIT_BROWN);
        registerVariantAdultIcon(Rabbit.Type.SALT_AND_PEPPER, MobsIcon.RABBIT_SALT);
        registerVariantAdultIcon(Rabbit.Type.THE_KILLER_BUNNY, MobsIcon.RABBIT_CAERBANNOG);
        //TODO: Baby variants
    }

    @Override
    protected Rabbit.Type getVariant(Rabbit rabbit) {
        return rabbit.getType();
    }

    @Override
    protected Icon getAdultIcon(Rabbit rabbit) {
        if (rabbit.getName().equals("Toast")) {
            return MobsIcon.RABBIT_TOAST;
        }
        return super.getAdultIcon(rabbit);
    }

    @Override
    protected Icon getBabyIcon(Rabbit rabbit) {
        //TODO Toast baby variant
        return super.getBabyIcon(rabbit);
    }
}
