package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Horse;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.List;

public class HorseMarkerBuilder extends AgeableVariantMarkerBuilder<Horse, Horse.Style, Horse.Color> {
    public HorseMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Horse.Style.NONE, MobIcon.HORSE_MARKINGS_NONE);
        registerVariantAdultIcon(Horse.Style.WHITE, MobIcon.HORSE_MARKINGS_WHITE);
        registerVariantAdultIcon(Horse.Style.WHITEFIELD, MobIcon.HORSE_MARKINGS_WHITEFIELD);
        registerVariantAdultIcon(Horse.Style.WHITE_DOTS, MobIcon.HORSE_MARKINGS_WHITE_DOTS);
        registerVariantAdultIcon(Horse.Style.BLACK_DOTS, MobIcon.HORSE_MARKINGS_BLACK_DOTS);
        registerVariantAdultStyleClasses(Horse.Color.WHITE, List.of(MobStyleClass.HORSE_WHITE));
        registerVariantAdultStyleClasses(Horse.Color.CREAMY, List.of(MobStyleClass.HORSE_CREAMY));
        registerVariantAdultStyleClasses(Horse.Color.CHESTNUT, List.of(MobStyleClass.HORSE_CHESTNUT));
        registerVariantAdultStyleClasses(Horse.Color.BROWN, List.of(MobStyleClass.HORSE_BROWN));
        registerVariantAdultStyleClasses(Horse.Color.BLACK, List.of(MobStyleClass.HORSE_BLACK));
        registerVariantAdultStyleClasses(Horse.Color.GRAY, List.of(MobStyleClass.HORSE_GRAY));
        registerVariantAdultStyleClasses(Horse.Color.DARK_BROWN, List.of(MobStyleClass.HORSE_DARK_BROWN));
        registerVariantBabyIcon(Horse.Style.NONE, MobIcon.HORSE_MARKINGS_NONE_BABY);
        registerVariantBabyIcon(Horse.Style.WHITE, MobIcon.HORSE_MARKINGS_WHITE_BABY);
        registerVariantBabyIcon(Horse.Style.WHITEFIELD, MobIcon.HORSE_MARKINGS_WHITEFIELD_BABY);
        registerVariantBabyIcon(Horse.Style.WHITE_DOTS, MobIcon.HORSE_MARKINGS_WHITE_DOTS_BABY);
        registerVariantBabyIcon(Horse.Style.BLACK_DOTS, MobIcon.HORSE_MARKINGS_BLACK_DOTS_BABY);
        registerVariantBabyStyleClasses(Horse.Color.WHITE, List.of(MobStyleClass.HORSE_WHITE_BABY));
        registerVariantBabyStyleClasses(Horse.Color.CREAMY, List.of(MobStyleClass.HORSE_CREAMY_BABY));
        registerVariantBabyStyleClasses(Horse.Color.CHESTNUT, List.of(MobStyleClass.HORSE_CHESTNUT_BABY));
        registerVariantBabyStyleClasses(Horse.Color.BROWN, List.of(MobStyleClass.HORSE_BROWN_BABY));
        registerVariantBabyStyleClasses(Horse.Color.BLACK, List.of(MobStyleClass.HORSE_BLACK_BABY));
        registerVariantBabyStyleClasses(Horse.Color.GRAY, List.of(MobStyleClass.HORSE_GRAY_BABY));
        registerVariantBabyStyleClasses(Horse.Color.DARK_BROWN, List.of(MobStyleClass.HORSE_DARK_BROWN_BABY));
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
