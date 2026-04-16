package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Horse;

import java.util.List;

public class HorseMarkerBuilder extends AgeableVariantMarkerBuilder<Horse, Horse.Style, Horse.Color> {
    public HorseMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Horse.Style.NONE, MobsIcon.HORSE_MARKINGS_NONE);
        registerVariantAdultIcon(Horse.Style.WHITE, MobsIcon.HORSE_MARKINGS_WHITE);
        registerVariantAdultIcon(Horse.Style.WHITEFIELD, MobsIcon.HORSE_MARKINGS_WHITEFIELD);
        registerVariantAdultIcon(Horse.Style.WHITE_DOTS, MobsIcon.HORSE_MARKINGS_WHITE_DOTS);
        registerVariantAdultIcon(Horse.Style.BLACK_DOTS, MobsIcon.HORSE_MARKINGS_BLACK_DOTS);
        registerVariantAdultStyleClasses(Horse.Color.WHITE, List.of(MobsStyleClass.HORSE_WHITE));
        registerVariantAdultStyleClasses(Horse.Color.CREAMY, List.of(MobsStyleClass.HORSE_CREAMY));
        registerVariantAdultStyleClasses(Horse.Color.CHESTNUT, List.of(MobsStyleClass.HORSE_CHESTNUT));
        registerVariantAdultStyleClasses(Horse.Color.BROWN, List.of(MobsStyleClass.HORSE_BROWN));
        registerVariantAdultStyleClasses(Horse.Color.BLACK, List.of(MobsStyleClass.HORSE_BLACK));
        registerVariantAdultStyleClasses(Horse.Color.GRAY, List.of(MobsStyleClass.HORSE_GRAY));
        registerVariantAdultStyleClasses(Horse.Color.DARK_BROWN, List.of(MobsStyleClass.HORSE_DARK_BROWN));
        //TODO: Add baby variants
    }

    @Override
    protected Horse.Style getIconVariant(Horse horse) {
        return horse.getStyle();
    }

    @Override
    protected Horse.Color getStyleClassesVariant(Horse horse) {
        return horse.getColor();
    }
}
