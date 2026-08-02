package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Rabbit;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class RabbitMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Rabbit.Type.GOLD, MobsIcon.RABBIT_GOLD);
        registerVariantAdultIcon(Rabbit.Type.WHITE, MobsIcon.RABBIT_WHITE);
        registerVariantAdultIcon(Rabbit.Type.BLACK_AND_WHITE, MobsIcon.RABBIT_BLACK_AND_WHITE);
        registerVariantAdultIcon(Rabbit.Type.BLACK, MobsIcon.RABBIT_BLACK);
        registerVariantAdultIcon(Rabbit.Type.BROWN, MobsIcon.RABBIT_BROWN);
        registerVariantAdultIcon(Rabbit.Type.SALT_AND_PEPPER, MobsIcon.RABBIT_SALT);
        registerVariantAdultIcon(Rabbit.Type.THE_KILLER_BUNNY, MobsIcon.RABBIT_CAERBANNOG);
        registerVariantBabyIcon(Rabbit.Type.GOLD, MobsIcon.RABBIT_GOLD_BABY);
        registerVariantBabyIcon(Rabbit.Type.WHITE, MobsIcon.RABBIT_WHITE_BABY);
        registerVariantBabyIcon(Rabbit.Type.BLACK_AND_WHITE, MobsIcon.RABBIT_BLACK_AND_WHITE_BABY);
        registerVariantBabyIcon(Rabbit.Type.BLACK, MobsIcon.RABBIT_BLACK_BABY);
        registerVariantBabyIcon(Rabbit.Type.BROWN, MobsIcon.RABBIT_BROWN_BABY);
        registerVariantBabyIcon(Rabbit.Type.SALT_AND_PEPPER, MobsIcon.RABBIT_SALT_BABY);
        registerVariantBabyIcon(Rabbit.Type.THE_KILLER_BUNNY, MobsIcon.RABBIT_CAERBANNOG_BABY);
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
        if (rabbit.getName().equals("Toast")) {
            return MobsIcon.RABBIT_TOAST_BABY;
        }
        return super.getBabyIcon(rabbit);
    }
}
