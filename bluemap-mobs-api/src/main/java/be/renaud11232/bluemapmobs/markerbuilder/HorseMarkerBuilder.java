package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Horse;

import java.util.List;

public class HorseMarkerBuilder extends SimpleVariantMarkerBuilder<Horse, Horse.Style, Horse.Color> {
    public HorseMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Horse.Style getIconVariant(Horse horse) {
        return horse.getStyle();
    }

    @Override
    protected Horse.Color getStyleClassesVariant(Horse horse) {
        return horse.getColor();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Horse.Style.NONE, MobsIcon.HORSE_MARKINGS_NONE);
        registerVariantIcon(Horse.Style.WHITE, MobsIcon.HORSE_MARKINGS_WHITE);
        registerVariantIcon(Horse.Style.WHITEFIELD, MobsIcon.HORSE_MARKINGS_WHITEFIELD);
        registerVariantIcon(Horse.Style.WHITE_DOTS, MobsIcon.HORSE_MARKINGS_WHITE_DOTS);
        registerVariantIcon(Horse.Style.BLACK_DOTS, MobsIcon.HORSE_MARKINGS_BLACK_DOTS);
    }

    @Override
    protected void registerVariantStyleClasses() {
        registerVariantStyleClass(Horse.Color.WHITE, List.of(MobsStyleClass.WHITE_HORSE));
        registerVariantStyleClass(Horse.Color.CREAMY, List.of(MobsStyleClass.CREAMY_HORSE));
        registerVariantStyleClass(Horse.Color.CHESTNUT, List.of(MobsStyleClass.CHESTNUT_HORSE));
        registerVariantStyleClass(Horse.Color.BROWN, List.of(MobsStyleClass.BROWN_HORSE));
        registerVariantStyleClass(Horse.Color.BLACK, List.of(MobsStyleClass.BLACK_HORSE));
        registerVariantStyleClass(Horse.Color.GRAY, List.of(MobsStyleClass.GRAY_HORSE));
        registerVariantStyleClass(Horse.Color.DARK_BROWN, List.of(MobsStyleClass.DARKBROWN_HORSE));
    }
}
