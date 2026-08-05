package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Rabbit;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class RabbitMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Rabbit.Type.GOLD, MobIcon.RABBIT_GOLD);
        registerVariantAdultIcon(Rabbit.Type.WHITE, MobIcon.RABBIT_WHITE);
        registerVariantAdultIcon(Rabbit.Type.BLACK_AND_WHITE, MobIcon.RABBIT_BLACK_AND_WHITE);
        registerVariantAdultIcon(Rabbit.Type.BLACK, MobIcon.RABBIT_BLACK);
        registerVariantAdultIcon(Rabbit.Type.BROWN, MobIcon.RABBIT_BROWN);
        registerVariantAdultIcon(Rabbit.Type.SALT_AND_PEPPER, MobIcon.RABBIT_SALT);
        registerVariantAdultIcon(Rabbit.Type.THE_KILLER_BUNNY, MobIcon.RABBIT_CAERBANNOG);
        registerVariantBabyIcon(Rabbit.Type.GOLD, MobIcon.RABBIT_GOLD_BABY);
        registerVariantBabyIcon(Rabbit.Type.WHITE, MobIcon.RABBIT_WHITE_BABY);
        registerVariantBabyIcon(Rabbit.Type.BLACK_AND_WHITE, MobIcon.RABBIT_BLACK_AND_WHITE_BABY);
        registerVariantBabyIcon(Rabbit.Type.BLACK, MobIcon.RABBIT_BLACK_BABY);
        registerVariantBabyIcon(Rabbit.Type.BROWN, MobIcon.RABBIT_BROWN_BABY);
        registerVariantBabyIcon(Rabbit.Type.SALT_AND_PEPPER, MobIcon.RABBIT_SALT_BABY);
        registerVariantBabyIcon(Rabbit.Type.THE_KILLER_BUNNY, MobIcon.RABBIT_CAERBANNOG_BABY);
    }

    @Override
    protected Rabbit.Type getVariant(Rabbit rabbit) {
        return rabbit.getType();
    }

    @Override
    protected Icon getAdultIcon(Rabbit rabbit) {
        if (rabbit.getName().equals("Toast")) {
            return MobIcon.RABBIT_TOAST;
        }
        return super.getAdultIcon(rabbit);
    }

    @Override
    protected Icon getBabyIcon(Rabbit rabbit) {
        if (rabbit.getName().equals("Toast")) {
            return MobIcon.RABBIT_TOAST_BABY;
        }
        return super.getBabyIcon(rabbit);
    }
}
