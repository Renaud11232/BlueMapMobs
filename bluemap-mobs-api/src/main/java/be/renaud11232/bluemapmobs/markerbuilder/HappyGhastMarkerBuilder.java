package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.HappyGhast;

import java.util.Collection;
import java.util.List;

public class HappyGhastMarkerBuilder extends AgeableSingleVariantMarkerBuilder<HappyGhast, HappyGhast.Harness> {
    public HappyGhastMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(HappyGhast.Harness.WHITE, MobsIcon.WHITE_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.LIGHT_GRAY, MobsIcon.LIGHT_GRAY_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.GRAY, MobsIcon.GRAY_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.BLACK, MobsIcon.BLACK_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.BROWN, MobsIcon.BROWN_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.RED, MobsIcon.RED_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.ORANGE, MobsIcon.ORANGE_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.YELLOW, MobsIcon.YELLOW_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.LIME, MobsIcon.LIME_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.GREEN, MobsIcon.GREEN_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.CYAN, MobsIcon.CYAN_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.LIGHT_BLUE, MobsIcon.LIGHT_BLUE_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.BLUE, MobsIcon.BLUE_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.PURPLE, MobsIcon.PURPLE_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.MAGENTA, MobsIcon.MAGENTA_HAPPY_GHAST_HARNESS);
        registerVariantAdultIcon(HappyGhast.Harness.PINK, MobsIcon.PINK_HAPPY_GHAST_HARNESS);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.HAPPY_GHAST_NO_HARNESS;
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobsStyleClass.ADULT_HAPPY_GHAST);
    }

    @Override
    protected Collection<String> getDefaultBabyStyleClasses() {
        return List.of(MobsStyleClass.BABY_HAPPY_GHAST);
    }

    @Override
    protected HappyGhast.Harness getVariant(HappyGhast happyGhast) {
        return happyGhast.getHarness();
    }
}
