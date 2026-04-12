package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Rabbit;

public class RabbitMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Rabbit.Type getVariant(Rabbit rabbit) {
        return rabbit.getType();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Rabbit.Type.GOLD, MobsIcon.GOLD_RABBIT);
        registerVariantIcon(Rabbit.Type.WHITE, MobsIcon.WHITE_RABBIT);
        registerVariantIcon(Rabbit.Type.BLACK_AND_WHITE, MobsIcon.WHITE_SPLOTCHED_RABBIT);
        registerVariantIcon(Rabbit.Type.BLACK, MobsIcon.BLACK_RABBIT);
        registerVariantIcon(Rabbit.Type.BROWN, MobsIcon.BROWN_RABBIT);
        registerVariantIcon(Rabbit.Type.SALT_AND_PEPPER, MobsIcon.SALT_RABBIT);
        registerVariantIcon(Rabbit.Type.THE_KILLER_BUNNY, MobsIcon.CAERBANNOG_RABBIT);
    }

    @Override
    protected Icon getIcon(Rabbit rabbit) {
        if (rabbit.getName().equals("Toast")) {
            return MobsIcon.TOAST_RABBIT;
        }
        return super.getIcon(rabbit);
    }
}
