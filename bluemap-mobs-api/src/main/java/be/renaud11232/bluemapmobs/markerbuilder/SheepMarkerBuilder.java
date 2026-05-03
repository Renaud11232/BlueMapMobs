package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Sheep;

import java.util.Collection;
import java.util.List;

public class SheepMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Sheep, Sheep.Color> {
    public SheepMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultStyleClasses(Sheep.Color.WHITE, List.of(MobsStyleClass.SHEEP_WOOL_WHITE));
        registerVariantAdultStyleClasses(Sheep.Color.ORANGE, List.of(MobsStyleClass.SHEEP_WOOL_ORANGE));
        registerVariantAdultStyleClasses(Sheep.Color.MAGENTA, List.of(MobsStyleClass.SHEEP_WOOL_MAGENTA));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_BLUE, List.of(MobsStyleClass.SHEEP_WOOL_LIGHT_BLUE));
        registerVariantAdultStyleClasses(Sheep.Color.YELLOW, List.of(MobsStyleClass.SHEEP_WOOL_YELLOW));
        registerVariantAdultStyleClasses(Sheep.Color.LIME, List.of(MobsStyleClass.SHEEP_WOOL_LIME));
        registerVariantAdultStyleClasses(Sheep.Color.PINK, List.of(MobsStyleClass.SHEEP_WOOL_PINK));
        registerVariantAdultStyleClasses(Sheep.Color.GRAY, List.of(MobsStyleClass.SHEEP_WOOL_GRAY));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_GRAY, List.of(MobsStyleClass.SHEEP_WOOL_LIGHT_GRAY));
        registerVariantAdultStyleClasses(Sheep.Color.CYAN, List.of(MobsStyleClass.SHEEP_WOOL_CYAN));
        registerVariantAdultStyleClasses(Sheep.Color.PURPLE, List.of(MobsStyleClass.SHEEP_WOOL_PURPLE));
        registerVariantAdultStyleClasses(Sheep.Color.BLUE, List.of(MobsStyleClass.SHEEP_WOOL_BLUE));
        registerVariantAdultStyleClasses(Sheep.Color.BROWN, List.of(MobsStyleClass.SHEEP_WOOL_BROWN));
        registerVariantAdultStyleClasses(Sheep.Color.GREEN, List.of(MobsStyleClass.SHEEP_WOOL_GREEN));
        registerVariantAdultStyleClasses(Sheep.Color.RED, List.of(MobsStyleClass.SHEEP_WOOL_RED));
        registerVariantAdultStyleClasses(Sheep.Color.BLACK, List.of(MobsStyleClass.SHEEP_WOOL_BLACK));
        registerVariantBabyStyleClasses(Sheep.Color.WHITE, List.of(MobsStyleClass.SHEEP_WOOL_WHITE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.ORANGE, List.of(MobsStyleClass.SHEEP_WOOL_ORANGE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.MAGENTA, List.of(MobsStyleClass.SHEEP_WOOL_MAGENTA_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.LIGHT_BLUE, List.of(MobsStyleClass.SHEEP_WOOL_LIGHT_BLUE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.YELLOW, List.of(MobsStyleClass.SHEEP_WOOL_YELLOW_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.LIME, List.of(MobsStyleClass.SHEEP_WOOL_LIME_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.PINK, List.of(MobsStyleClass.SHEEP_WOOL_PINK_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.GRAY, List.of(MobsStyleClass.SHEEP_WOOL_GRAY_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.LIGHT_GRAY, List.of(MobsStyleClass.SHEEP_WOOL_LIGHT_GRAY_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.CYAN, List.of(MobsStyleClass.SHEEP_WOOL_CYAN_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.PURPLE, List.of(MobsStyleClass.SHEEP_WOOL_PURPLE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.BLUE, List.of(MobsStyleClass.SHEEP_WOOL_BLUE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.BROWN, List.of(MobsStyleClass.SHEEP_WOOL_BROWN_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.GREEN, List.of(MobsStyleClass.SHEEP_WOOL_GREEN_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.RED, List.of(MobsStyleClass.SHEEP_WOOL_RED_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.BLACK, List.of(MobsStyleClass.SHEEP_WOOL_BLACK_BABY));
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.SHEEP;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.SHEEP_BABY;
    }

    @Override
    protected Collection<String> getAdultStyleClasses(Sheep sheep) {
        if (sheep.getName().equals("jeb_")) {
            return List.of(MobsStyleClass.SHEEP_JEB);
        }
        return super.getAdultStyleClasses(sheep);
    }

    @Override
    protected Collection<String> getBabyStyleClasses(Sheep sheep) {
        if (sheep.getName().equals("jeb_")) {
            return List.of(MobsStyleClass.SHEEP_JEB_BABY);
        }
        return super.getBabyStyleClasses(sheep);
    }

    @Override
    protected Sheep.Color getVariant(Sheep sheep) {
        return sheep.getColor();
    }
}
