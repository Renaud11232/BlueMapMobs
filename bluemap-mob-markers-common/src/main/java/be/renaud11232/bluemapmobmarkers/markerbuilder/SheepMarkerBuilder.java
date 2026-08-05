package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Sheep;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.List;

public class SheepMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Sheep, Sheep.Color> {
    public SheepMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultStyleClasses(Sheep.Color.WHITE, List.of(MobStyleClass.SHEEP_WOOL_WHITE));
        registerVariantAdultStyleClasses(Sheep.Color.ORANGE, List.of(MobStyleClass.SHEEP_WOOL_ORANGE));
        registerVariantAdultStyleClasses(Sheep.Color.MAGENTA, List.of(MobStyleClass.SHEEP_WOOL_MAGENTA));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_BLUE, List.of(MobStyleClass.SHEEP_WOOL_LIGHT_BLUE));
        registerVariantAdultStyleClasses(Sheep.Color.YELLOW, List.of(MobStyleClass.SHEEP_WOOL_YELLOW));
        registerVariantAdultStyleClasses(Sheep.Color.LIME, List.of(MobStyleClass.SHEEP_WOOL_LIME));
        registerVariantAdultStyleClasses(Sheep.Color.PINK, List.of(MobStyleClass.SHEEP_WOOL_PINK));
        registerVariantAdultStyleClasses(Sheep.Color.GRAY, List.of(MobStyleClass.SHEEP_WOOL_GRAY));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_GRAY, List.of(MobStyleClass.SHEEP_WOOL_LIGHT_GRAY));
        registerVariantAdultStyleClasses(Sheep.Color.CYAN, List.of(MobStyleClass.SHEEP_WOOL_CYAN));
        registerVariantAdultStyleClasses(Sheep.Color.PURPLE, List.of(MobStyleClass.SHEEP_WOOL_PURPLE));
        registerVariantAdultStyleClasses(Sheep.Color.BLUE, List.of(MobStyleClass.SHEEP_WOOL_BLUE));
        registerVariantAdultStyleClasses(Sheep.Color.BROWN, List.of(MobStyleClass.SHEEP_WOOL_BROWN));
        registerVariantAdultStyleClasses(Sheep.Color.GREEN, List.of(MobStyleClass.SHEEP_WOOL_GREEN));
        registerVariantAdultStyleClasses(Sheep.Color.RED, List.of(MobStyleClass.SHEEP_WOOL_RED));
        registerVariantAdultStyleClasses(Sheep.Color.BLACK, List.of(MobStyleClass.SHEEP_WOOL_BLACK));
        registerVariantBabyStyleClasses(Sheep.Color.WHITE, List.of(MobStyleClass.SHEEP_WOOL_WHITE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.ORANGE, List.of(MobStyleClass.SHEEP_WOOL_ORANGE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.MAGENTA, List.of(MobStyleClass.SHEEP_WOOL_MAGENTA_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.LIGHT_BLUE, List.of(MobStyleClass.SHEEP_WOOL_LIGHT_BLUE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.YELLOW, List.of(MobStyleClass.SHEEP_WOOL_YELLOW_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.LIME, List.of(MobStyleClass.SHEEP_WOOL_LIME_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.PINK, List.of(MobStyleClass.SHEEP_WOOL_PINK_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.GRAY, List.of(MobStyleClass.SHEEP_WOOL_GRAY_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.LIGHT_GRAY, List.of(MobStyleClass.SHEEP_WOOL_LIGHT_GRAY_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.CYAN, List.of(MobStyleClass.SHEEP_WOOL_CYAN_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.PURPLE, List.of(MobStyleClass.SHEEP_WOOL_PURPLE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.BLUE, List.of(MobStyleClass.SHEEP_WOOL_BLUE_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.BROWN, List.of(MobStyleClass.SHEEP_WOOL_BROWN_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.GREEN, List.of(MobStyleClass.SHEEP_WOOL_GREEN_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.RED, List.of(MobStyleClass.SHEEP_WOOL_RED_BABY));
        registerVariantBabyStyleClasses(Sheep.Color.BLACK, List.of(MobStyleClass.SHEEP_WOOL_BLACK_BABY));
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.SHEEP;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.SHEEP_BABY;
    }

    @Override
    protected Collection<String> getAdultStyleClasses(Sheep sheep) {
        if (sheep.getName().equals("jeb_")) {
            return List.of(MobStyleClass.SHEEP_JEB);
        }
        return super.getAdultStyleClasses(sheep);
    }

    @Override
    protected Collection<String> getBabyStyleClasses(Sheep sheep) {
        if (sheep.getName().equals("jeb_")) {
            return List.of(MobStyleClass.SHEEP_JEB_BABY);
        }
        return super.getBabyStyleClasses(sheep);
    }

    @Override
    protected Sheep.Color getVariant(Sheep sheep) {
        return sheep.getColor();
    }
}
