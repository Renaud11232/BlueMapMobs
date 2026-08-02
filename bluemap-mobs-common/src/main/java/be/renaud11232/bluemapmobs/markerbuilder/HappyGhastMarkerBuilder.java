package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.HappyGhast;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.List;

public class HappyGhastMarkerBuilder extends AgeableSingleVariantMarkerBuilder<HappyGhast, HappyGhast.Harness> {
    public HappyGhastMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(HappyGhast.Harness.WHITE, MobsIcon.HAPPY_GHAST_HARNESS_WHITE);
        registerVariantAdultIcon(HappyGhast.Harness.LIGHT_GRAY, MobsIcon.HAPPY_GHAST_HARNESS_LIGHT_GRAY);
        registerVariantAdultIcon(HappyGhast.Harness.GRAY, MobsIcon.HAPPY_GHAST_HARNESS_GRAY);
        registerVariantAdultIcon(HappyGhast.Harness.BLACK, MobsIcon.HAPPY_GHAST_HARNESS_BLACK);
        registerVariantAdultIcon(HappyGhast.Harness.BROWN, MobsIcon.HAPPY_GHAST_HARNESS_BROWN);
        registerVariantAdultIcon(HappyGhast.Harness.RED, MobsIcon.HAPPY_GHAST_HARNESS_RED);
        registerVariantAdultIcon(HappyGhast.Harness.ORANGE, MobsIcon.HAPPY_GHAST_HARNESS_ORANGE);
        registerVariantAdultIcon(HappyGhast.Harness.YELLOW, MobsIcon.HAPPY_GHAST_HARNESS_YELLOW);
        registerVariantAdultIcon(HappyGhast.Harness.LIME, MobsIcon.HAPPY_GHAST_HARNESS_LIME);
        registerVariantAdultIcon(HappyGhast.Harness.GREEN, MobsIcon.HAPPY_GHAST_HARNESS_GREEN);
        registerVariantAdultIcon(HappyGhast.Harness.CYAN, MobsIcon.HAPPY_GHAST_HARNESS_CYAN);
        registerVariantAdultIcon(HappyGhast.Harness.LIGHT_BLUE, MobsIcon.HAPPY_GHAST_HARNESS_LIGHT_BLUE);
        registerVariantAdultIcon(HappyGhast.Harness.BLUE, MobsIcon.HAPPY_GHAST_HARNESS_BLUE);
        registerVariantAdultIcon(HappyGhast.Harness.PURPLE, MobsIcon.HAPPY_GHAST_HARNESS_PURPLE);
        registerVariantAdultIcon(HappyGhast.Harness.MAGENTA, MobsIcon.HAPPY_GHAST_HARNESS_MAGENTA);
        registerVariantAdultIcon(HappyGhast.Harness.PINK, MobsIcon.HAPPY_GHAST_HARNESS_PINK);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.HAPPY_GHAST_HARNESS_NONE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.HAPPY_GHAST_BABY;
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobsStyleClass.HAPPY_GHAST);
    }

    @Override
    protected HappyGhast.Harness getVariant(HappyGhast happyGhast) {
        return happyGhast.getHarness();
    }
}
