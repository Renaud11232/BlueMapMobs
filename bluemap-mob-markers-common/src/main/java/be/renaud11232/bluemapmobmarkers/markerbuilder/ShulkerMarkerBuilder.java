package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Shulker;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class ShulkerMarkerBuilder extends MobSingleVariantMarkerBuilder<Shulker, Shulker.Color> {
    public ShulkerMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantIcon(Shulker.Color.WHITE, MobIcon.SHULKER_WHITE);
        registerVariantIcon(Shulker.Color.ORANGE, MobIcon.SHULKER_ORANGE);
        registerVariantIcon(Shulker.Color.MAGENTA, MobIcon.SHULKER_MAGENTA);
        registerVariantIcon(Shulker.Color.LIGHT_BLUE, MobIcon.SHULKER_LIGHT_BLUE);
        registerVariantIcon(Shulker.Color.YELLOW, MobIcon.SHULKER_YELLOW);
        registerVariantIcon(Shulker.Color.LIME, MobIcon.SHULKER_LIME);
        registerVariantIcon(Shulker.Color.PINK, MobIcon.SHULKER_PINK);
        registerVariantIcon(Shulker.Color.GRAY, MobIcon.SHULKER_GRAY);
        registerVariantIcon(Shulker.Color.LIGHT_GRAY, MobIcon.SHULKER_LIGHT_GRAY);
        registerVariantIcon(Shulker.Color.CYAN, MobIcon.SHULKER_CYAN);
        registerVariantIcon(Shulker.Color.PURPLE, MobIcon.SHULKER_PURPLE);
        registerVariantIcon(Shulker.Color.BLUE, MobIcon.SHULKER_BLUE);
        registerVariantIcon(Shulker.Color.BROWN, MobIcon.SHULKER_BROWN);
        registerVariantIcon(Shulker.Color.GREEN, MobIcon.SHULKER_GREEN);
        registerVariantIcon(Shulker.Color.RED, MobIcon.SHULKER_RED);
        registerVariantIcon(Shulker.Color.BLACK, MobIcon.SHULKER_BLACK);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobIcon.SHULKER;
    }

    @Override
    protected Shulker.Color getVariant(Shulker shulker) {
        return shulker.getColor();
    }
}
