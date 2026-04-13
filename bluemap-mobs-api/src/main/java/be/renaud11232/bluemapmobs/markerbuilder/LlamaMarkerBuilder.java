package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Llama;

import java.util.List;

public class LlamaMarkerBuilder extends SimpleVariantMarkerBuilder<Llama, Llama.Carpet, Llama.Color> {
    public LlamaMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
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

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Llama.Carpet.WHITE, MobsIcon.WHITE_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.LIGHT_GRAY, MobsIcon.LIGHT_GRAY_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.GRAY, MobsIcon.GRAY_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.BLACK, MobsIcon.BLACK_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.BROWN, MobsIcon.BROWN_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.RED, MobsIcon.RED_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.ORANGE, MobsIcon.ORANGE_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.YELLOW, MobsIcon.YELLOW_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.LIME, MobsIcon.LIME_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.GREEN, MobsIcon.GREEN_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.CYAN, MobsIcon.CYAN_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.LIGHT_BLUE, MobsIcon.LIGHT_BLUE_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.BLUE, MobsIcon.BLUE_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.PURPLE, MobsIcon.PURPLE_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.MAGENTA, MobsIcon.MAGENTA_LLAMA_DECOR);
        registerVariantIcon(Llama.Carpet.PINK, MobsIcon.PINK_LLAMA_DECOR);
    }

    @Override
    protected void registerVariantStyleClasses() {
        registerVariantStyleClass(Llama.Color.CREAMY, List.of(MobsStyleClass.CREAMY_LLAMA));
        registerVariantStyleClass(Llama.Color.WHITE, List.of(MobsStyleClass.WHITE_LLAMA));
        registerVariantStyleClass(Llama.Color.GRAY, List.of(MobsStyleClass.GRAY_LLAMA));
        registerVariantStyleClass(Llama.Color.BROWN, List.of(MobsStyleClass.BROWN_LLAMA));
    }
}
