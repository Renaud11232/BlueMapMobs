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
        registerVariantAdultIcon(Llama.Carpet.WHITE, MobsIcon.LLAMA_DECOR_WHITE);
        registerVariantAdultIcon(Llama.Carpet.LIGHT_GRAY, MobsIcon.LLAMA_DECOR_LIGHT_GRAY);
        registerVariantAdultIcon(Llama.Carpet.GRAY, MobsIcon.LLAMA_DECOR_GRAY);
        registerVariantAdultIcon(Llama.Carpet.BLACK, MobsIcon.LLAMA_DECOR_BLACK);
        registerVariantAdultIcon(Llama.Carpet.BROWN, MobsIcon.LLAMA_DECOR_BROWN);
        registerVariantAdultIcon(Llama.Carpet.RED, MobsIcon.LLAMA_DECOR_RED);
        registerVariantAdultIcon(Llama.Carpet.ORANGE, MobsIcon.LLAMA_DECOR_ORANGE);
        registerVariantAdultIcon(Llama.Carpet.YELLOW, MobsIcon.LLAMA_DECOR_YELLOW);
        registerVariantAdultIcon(Llama.Carpet.LIME, MobsIcon.LLAMA_DECOR_LIME);
        registerVariantAdultIcon(Llama.Carpet.GREEN, MobsIcon.LLAMA_DECOR_GREEN);
        registerVariantAdultIcon(Llama.Carpet.CYAN, MobsIcon.LLAMA_DECOR_CYAN);
        registerVariantAdultIcon(Llama.Carpet.LIGHT_BLUE, MobsIcon.LLAMA_DECOR_LIGHT_BLUE);
        registerVariantAdultIcon(Llama.Carpet.BLUE, MobsIcon.LLAMA_DECOR_BLUE);
        registerVariantAdultIcon(Llama.Carpet.PURPLE, MobsIcon.LLAMA_DECOR_PURPLE);
        registerVariantAdultIcon(Llama.Carpet.MAGENTA, MobsIcon.LLAMA_DECOR_MAGENTA);
        registerVariantAdultIcon(Llama.Carpet.PINK, MobsIcon.LLAMA_DECOR_PINK);
        registerVariantAdultStyleClasses(Llama.Color.CREAMY, List.of(MobsStyleClass.LLAMA_CREAMY));
        registerVariantAdultStyleClasses(Llama.Color.WHITE, List.of(MobsStyleClass.LLAMA_WHITE));
        registerVariantAdultStyleClasses(Llama.Color.GRAY, List.of(MobsStyleClass.LLAMA_GRAY));
        registerVariantAdultStyleClasses(Llama.Color.BROWN, List.of(MobsStyleClass.LLAMA_BROWN));
        registerVariantBabyStyleClasses(Llama.Color.CREAMY, List.of(MobsStyleClass.LLAMA_CREAMY_BABY));
        registerVariantBabyStyleClasses(Llama.Color.WHITE, List.of(MobsStyleClass.LLAMA_WHITE_BABY));
        registerVariantBabyStyleClasses(Llama.Color.GRAY, List.of(MobsStyleClass.LLAMA_GRAY_BABY));
        registerVariantBabyStyleClasses(Llama.Color.BROWN, List.of(MobsStyleClass.LLAMA_BROWN_BABY));
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.LLAMA_DECOR_NONE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.LLAMA_DECOR_NONE_BABY;
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
