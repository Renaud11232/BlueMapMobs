package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.HappyGhast;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.List;

public class HappyGhastMarkerBuilder extends AgeableSingleVariantMarkerBuilder<HappyGhast, HappyGhast.Harness> {
    public HappyGhastMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(HappyGhast.Harness.WHITE, MobIcon.HAPPY_GHAST_HARNESS_WHITE);
        registerVariantAdultIcon(HappyGhast.Harness.LIGHT_GRAY, MobIcon.HAPPY_GHAST_HARNESS_LIGHT_GRAY);
        registerVariantAdultIcon(HappyGhast.Harness.GRAY, MobIcon.HAPPY_GHAST_HARNESS_GRAY);
        registerVariantAdultIcon(HappyGhast.Harness.BLACK, MobIcon.HAPPY_GHAST_HARNESS_BLACK);
        registerVariantAdultIcon(HappyGhast.Harness.BROWN, MobIcon.HAPPY_GHAST_HARNESS_BROWN);
        registerVariantAdultIcon(HappyGhast.Harness.RED, MobIcon.HAPPY_GHAST_HARNESS_RED);
        registerVariantAdultIcon(HappyGhast.Harness.ORANGE, MobIcon.HAPPY_GHAST_HARNESS_ORANGE);
        registerVariantAdultIcon(HappyGhast.Harness.YELLOW, MobIcon.HAPPY_GHAST_HARNESS_YELLOW);
        registerVariantAdultIcon(HappyGhast.Harness.LIME, MobIcon.HAPPY_GHAST_HARNESS_LIME);
        registerVariantAdultIcon(HappyGhast.Harness.GREEN, MobIcon.HAPPY_GHAST_HARNESS_GREEN);
        registerVariantAdultIcon(HappyGhast.Harness.CYAN, MobIcon.HAPPY_GHAST_HARNESS_CYAN);
        registerVariantAdultIcon(HappyGhast.Harness.LIGHT_BLUE, MobIcon.HAPPY_GHAST_HARNESS_LIGHT_BLUE);
        registerVariantAdultIcon(HappyGhast.Harness.BLUE, MobIcon.HAPPY_GHAST_HARNESS_BLUE);
        registerVariantAdultIcon(HappyGhast.Harness.PURPLE, MobIcon.HAPPY_GHAST_HARNESS_PURPLE);
        registerVariantAdultIcon(HappyGhast.Harness.MAGENTA, MobIcon.HAPPY_GHAST_HARNESS_MAGENTA);
        registerVariantAdultIcon(HappyGhast.Harness.PINK, MobIcon.HAPPY_GHAST_HARNESS_PINK);
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.HAPPY_GHAST_HARNESS_NONE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.HAPPY_GHAST_BABY;
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobStyleClass.HAPPY_GHAST);
    }

    @Override
    protected HappyGhast.Harness getVariant(HappyGhast happyGhast) {
        return happyGhast.getHarness();
    }
}
