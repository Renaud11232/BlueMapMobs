package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Llama;

import java.util.List;

public class LlamaMarkerBuilder extends AgeableVariantMarkerBuilder<Llama, Llama.Carpet, Llama.Color> {
    public LlamaMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Llama.Carpet.WHITE, MobsIcon.WHITE_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.LIGHT_GRAY, MobsIcon.LIGHT_GRAY_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.GRAY, MobsIcon.GRAY_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.BLACK, MobsIcon.BLACK_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.BROWN, MobsIcon.BROWN_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.RED, MobsIcon.RED_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.ORANGE, MobsIcon.ORANGE_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.YELLOW, MobsIcon.YELLOW_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.LIME, MobsIcon.LIME_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.GREEN, MobsIcon.GREEN_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.CYAN, MobsIcon.CYAN_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.LIGHT_BLUE, MobsIcon.LIGHT_BLUE_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.BLUE, MobsIcon.BLUE_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.PURPLE, MobsIcon.PURPLE_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.MAGENTA, MobsIcon.MAGENTA_LLAMA_DECOR);
        registerVariantAdultIcon(Llama.Carpet.PINK, MobsIcon.PINK_LLAMA_DECOR);
        registerVariantAdultStyleClasses(Llama.Color.CREAMY, List.of(MobsStyleClass.CREAMY_LLAMA));
        registerVariantAdultStyleClasses(Llama.Color.WHITE, List.of(MobsStyleClass.WHITE_LLAMA));
        registerVariantAdultStyleClasses(Llama.Color.GRAY, List.of(MobsStyleClass.GRAY_LLAMA));
        registerVariantAdultStyleClasses(Llama.Color.BROWN, List.of(MobsStyleClass.BROWN_LLAMA));
        //TODO: add baby variants
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.LLAMA_EMPTY_DECOR;
    }

    @Override
    protected Llama.Carpet getIconVariant(Llama llama) {
        return llama.getCarpet();
    }

    @Override
    protected Llama.Color getStyleClassesVariant(Llama llama) {
        return llama.getColor();
    }
}
