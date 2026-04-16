package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Sheep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SheepMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Sheep, Sheep.Color> {
    public SheepMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultStyleClasses(Sheep.Color.WHITE, List.of(MobsStyleClass.SHEEP_WHITE));
        registerVariantAdultStyleClasses(Sheep.Color.ORANGE, List.of(MobsStyleClass.SHEEP_ORANGE));
        registerVariantAdultStyleClasses(Sheep.Color.MAGENTA, List.of(MobsStyleClass.SHEEP_MAGENTA));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_BLUE, List.of(MobsStyleClass.SHEEP_LIGHT_BLUE));
        registerVariantAdultStyleClasses(Sheep.Color.YELLOW, List.of(MobsStyleClass.SHEEP_YELLOW));
        registerVariantAdultStyleClasses(Sheep.Color.LIME, List.of(MobsStyleClass.SHEEP_LIME));
        registerVariantAdultStyleClasses(Sheep.Color.PINK, List.of(MobsStyleClass.SHEEP_PINK));
        registerVariantAdultStyleClasses(Sheep.Color.GRAY, List.of(MobsStyleClass.SHEEP_GRAY));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_GRAY, List.of(MobsStyleClass.SHEEP_LIGHT_GRAY));
        registerVariantAdultStyleClasses(Sheep.Color.CYAN, List.of(MobsStyleClass.SHEEP_CYAN));
        registerVariantAdultStyleClasses(Sheep.Color.PURPLE, List.of(MobsStyleClass.SHEEP_PURPLE));
        registerVariantAdultStyleClasses(Sheep.Color.BLUE, List.of(MobsStyleClass.SHEEP_BLUE));
        registerVariantAdultStyleClasses(Sheep.Color.BROWN, List.of(MobsStyleClass.SHEEP_BROWN));
        registerVariantAdultStyleClasses(Sheep.Color.GREEN, List.of(MobsStyleClass.SHEEP_GREEN));
        registerVariantAdultStyleClasses(Sheep.Color.RED, List.of(MobsStyleClass.SHEEP_RED));
        registerVariantAdultStyleClasses(Sheep.Color.BLACK, List.of(MobsStyleClass.SHEEP_BLACK));
        //TODO: Add baby variants
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.SHEEP;
    }

    @Override
    protected Sheep.Color getVariant(Sheep sheep) {
        return sheep.getColor();
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobsStyleClass.SHEEP_WHITE);
    }

    @Override
    protected Collection<String> getStyleClasses(Sheep sheep) {
        Collection<String> styleClasses = super.getStyleClasses(sheep);
        if (sheep.getName().equals("jeb_")) {
            styleClasses = new ArrayList<>(styleClasses);
            styleClasses.add(MobsStyleClass.SHEEP_JEB);
        }
        return styleClasses;
    }
}
