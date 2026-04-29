package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Shulker;

public class ShulkerMarkerBuilder extends MobSingleVariantMarkerBuilder<Shulker, Shulker.Color> {
    public ShulkerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantIcon(Shulker.Color.WHITE, MobsIcon.SHULKER_WHITE);
        registerVariantIcon(Shulker.Color.ORANGE, MobsIcon.SHULKER_ORANGE);
        registerVariantIcon(Shulker.Color.MAGENTA, MobsIcon.SHULKER_MAGENTA);
        registerVariantIcon(Shulker.Color.LIGHT_BLUE, MobsIcon.SHULKER_LIGHT_BLUE);
        registerVariantIcon(Shulker.Color.YELLOW, MobsIcon.SHULKER_YELLOW);
        registerVariantIcon(Shulker.Color.LIME, MobsIcon.SHULKER_LIME);
        registerVariantIcon(Shulker.Color.PINK, MobsIcon.SHULKER_PINK);
        registerVariantIcon(Shulker.Color.GRAY, MobsIcon.SHULKER_GRAY);
        registerVariantIcon(Shulker.Color.LIGHT_GRAY, MobsIcon.SHULKER_LIGHT_GRAY);
        registerVariantIcon(Shulker.Color.CYAN, MobsIcon.SHULKER_CYAN);
        registerVariantIcon(Shulker.Color.PURPLE, MobsIcon.SHULKER_PURPLE);
        registerVariantIcon(Shulker.Color.BLUE, MobsIcon.SHULKER_BLUE);
        registerVariantIcon(Shulker.Color.BROWN, MobsIcon.SHULKER_BROWN);
        registerVariantIcon(Shulker.Color.GREEN, MobsIcon.SHULKER_GREEN);
        registerVariantIcon(Shulker.Color.RED, MobsIcon.SHULKER_RED);
        registerVariantIcon(Shulker.Color.BLACK, MobsIcon.SHULKER_BLACK);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.SHULKER;
    }

    @Override
    protected Shulker.Color getVariant(Shulker shulker) {
        return shulker.getColor();
    }
}
