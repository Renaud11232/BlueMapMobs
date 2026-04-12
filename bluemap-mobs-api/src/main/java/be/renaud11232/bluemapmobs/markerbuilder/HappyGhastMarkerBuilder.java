package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.HappyGhast;

import java.util.List;

public class HappyGhastMarkerBuilder extends SimpleVariantMarkerBuilder<HappyGhast, HappyGhast.Harness, Boolean> {
    public HappyGhastMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.HAPPY_GHAST_NO_HARNESS;
    }

    @Override
    protected HappyGhast.Harness getIconVariant(HappyGhast happyGhast) {
        return happyGhast.getHarness();
    }

    @Override
    protected Boolean getStyleClassesVariant(HappyGhast happyGhast) {
        return happyGhast.isAdult();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(HappyGhast.Harness.WHITE, MobsIcon.WHITE_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.LIGHT_GRAY, MobsIcon.LIGHTGRAY_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.GRAY, MobsIcon.GRAY_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.BLACK, MobsIcon.BLACK_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.BROWN, MobsIcon.BROWN_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.RED, MobsIcon.RED_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.ORANGE, MobsIcon.ORANGE_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.YELLOW, MobsIcon.YELLOW_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.LIME, MobsIcon.LIME_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.GREEN, MobsIcon.GREEN_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.CYAN, MobsIcon.CYAN_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.LIGHT_BLUE, MobsIcon.LIGHTBLUE_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.BLUE, MobsIcon.BLUE_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.PURPLE, MobsIcon.PURPLE_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.MAGENTA, MobsIcon.MAGENTA_HAPPY_GHAST_HARNESS);
        registerVariantIcon(HappyGhast.Harness.PINK, MobsIcon.PINK_HAPPY_GHAST_HARNESS);
    }

    @Override
    protected void registerVariantStyleClasses() {
        registerVariantStyleClass(true, List.of(MobsStyleClass.ADULT_HAPPY_GHAST));
        registerVariantStyleClass(false, List.of(MobsStyleClass.BABY_HAPPY_GHAST));
    }
}
