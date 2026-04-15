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
        registerVariantAdultStyleClasses(Sheep.Color.WHITE, List.of(MobsStyleClass.WHITE_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.ORANGE, List.of(MobsStyleClass.ORANGE_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.MAGENTA, List.of(MobsStyleClass.MAGENTA_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_BLUE, List.of(MobsStyleClass.LIGHT_BLUE_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.YELLOW, List.of(MobsStyleClass.YELLOW_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.LIME, List.of(MobsStyleClass.LIME_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.PINK, List.of(MobsStyleClass.PINK_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.GRAY, List.of(MobsStyleClass.GRAY_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.LIGHT_GRAY, List.of(MobsStyleClass.LIGHT_GRAY_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.CYAN, List.of(MobsStyleClass.CYAN_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.PURPLE, List.of(MobsStyleClass.PURPLE_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.BLUE, List.of(MobsStyleClass.BLUE_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.BROWN, List.of(MobsStyleClass.BROWN_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.GREEN, List.of(MobsStyleClass.GREEN_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.RED, List.of(MobsStyleClass.RED_SHEEP));
        registerVariantAdultStyleClasses(Sheep.Color.BLACK, List.of(MobsStyleClass.BLACK_SHEEP));
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
        return List.of(MobsStyleClass.WHITE_SHEEP);
    }

    @Override
    protected Collection<String> getStyleClasses(Sheep sheep) {
        Collection<String> styleClasses = super.getStyleClasses(sheep);
        if (sheep.getName().equals("jeb_")) {
            styleClasses = new ArrayList<>(styleClasses);
            styleClasses.add(MobsStyleClass.JEB_SHEEP);
        }
        return styleClasses;
    }
}
