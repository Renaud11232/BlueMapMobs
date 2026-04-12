package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Sheep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SheepMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Sheep, Sheep.Color> {
    public SheepMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.SHEEP;
    }

    @Override
    protected Sheep.Color getVariant(Sheep sheep) {
        return sheep.getColor();
    }

    @Override
    protected void registerVariantStyleClasses() {
        registerVariantStyleClass(Sheep.Color.WHITE, List.of(MobsStyleClass.WHITE_SHEEP));
        registerVariantStyleClass(Sheep.Color.ORANGE, List.of(MobsStyleClass.ORANGE_SHEEP));
        registerVariantStyleClass(Sheep.Color.MAGENTA, List.of(MobsStyleClass.MAGENTA_SHEEP));
        registerVariantStyleClass(Sheep.Color.LIGHT_BLUE, List.of(MobsStyleClass.LIGHTBLUE_SHEEP));
        registerVariantStyleClass(Sheep.Color.YELLOW, List.of(MobsStyleClass.YELLOW_SHEEP));
        registerVariantStyleClass(Sheep.Color.LIME, List.of(MobsStyleClass.LIME_SHEEP));
        registerVariantStyleClass(Sheep.Color.PINK, List.of(MobsStyleClass.PINK_SHEEP));
        registerVariantStyleClass(Sheep.Color.GRAY, List.of(MobsStyleClass.GRAY_SHEEP));
        registerVariantStyleClass(Sheep.Color.LIGHT_GRAY, List.of(MobsStyleClass.LIGHTGRAY_SHEEP));
        registerVariantStyleClass(Sheep.Color.CYAN, List.of(MobsStyleClass.CYAN_SHEEP));
        registerVariantStyleClass(Sheep.Color.PURPLE, List.of(MobsStyleClass.PURPLE_SHEEP));
        registerVariantStyleClass(Sheep.Color.BLUE, List.of(MobsStyleClass.BLUE_SHEEP));
        registerVariantStyleClass(Sheep.Color.BROWN, List.of(MobsStyleClass.BROWN_SHEEP));
        registerVariantStyleClass(Sheep.Color.GREEN, List.of(MobsStyleClass.GREEN_SHEEP));
        registerVariantStyleClass(Sheep.Color.RED, List.of(MobsStyleClass.RED_SHEEP));
        registerVariantStyleClass(Sheep.Color.BLACK, List.of(MobsStyleClass.BLACK_SHEEP));
    }

    @Override
    protected Collection<String> getDefaultStyleClasses() {
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
