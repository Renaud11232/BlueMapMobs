package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Llama;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.List;

public class LlamaMarkerBuilder extends AgeableVariantMarkerBuilder<Llama, Llama.Carpet, Llama.Color> {
    public LlamaMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Llama.Carpet.WHITE, MobIcon.LLAMA_DECOR_WHITE);
        registerVariantAdultIcon(Llama.Carpet.LIGHT_GRAY, MobIcon.LLAMA_DECOR_LIGHT_GRAY);
        registerVariantAdultIcon(Llama.Carpet.GRAY, MobIcon.LLAMA_DECOR_GRAY);
        registerVariantAdultIcon(Llama.Carpet.BLACK, MobIcon.LLAMA_DECOR_BLACK);
        registerVariantAdultIcon(Llama.Carpet.BROWN, MobIcon.LLAMA_DECOR_BROWN);
        registerVariantAdultIcon(Llama.Carpet.RED, MobIcon.LLAMA_DECOR_RED);
        registerVariantAdultIcon(Llama.Carpet.ORANGE, MobIcon.LLAMA_DECOR_ORANGE);
        registerVariantAdultIcon(Llama.Carpet.YELLOW, MobIcon.LLAMA_DECOR_YELLOW);
        registerVariantAdultIcon(Llama.Carpet.LIME, MobIcon.LLAMA_DECOR_LIME);
        registerVariantAdultIcon(Llama.Carpet.GREEN, MobIcon.LLAMA_DECOR_GREEN);
        registerVariantAdultIcon(Llama.Carpet.CYAN, MobIcon.LLAMA_DECOR_CYAN);
        registerVariantAdultIcon(Llama.Carpet.LIGHT_BLUE, MobIcon.LLAMA_DECOR_LIGHT_BLUE);
        registerVariantAdultIcon(Llama.Carpet.BLUE, MobIcon.LLAMA_DECOR_BLUE);
        registerVariantAdultIcon(Llama.Carpet.PURPLE, MobIcon.LLAMA_DECOR_PURPLE);
        registerVariantAdultIcon(Llama.Carpet.MAGENTA, MobIcon.LLAMA_DECOR_MAGENTA);
        registerVariantAdultIcon(Llama.Carpet.PINK, MobIcon.LLAMA_DECOR_PINK);
        registerVariantAdultStyleClasses(Llama.Color.CREAMY, List.of(MobStyleClass.LLAMA_CREAMY));
        registerVariantAdultStyleClasses(Llama.Color.WHITE, List.of(MobStyleClass.LLAMA_WHITE));
        registerVariantAdultStyleClasses(Llama.Color.GRAY, List.of(MobStyleClass.LLAMA_GRAY));
        registerVariantAdultStyleClasses(Llama.Color.BROWN, List.of(MobStyleClass.LLAMA_BROWN));
        registerVariantBabyStyleClasses(Llama.Color.CREAMY, List.of(MobStyleClass.LLAMA_CREAMY_BABY));
        registerVariantBabyStyleClasses(Llama.Color.WHITE, List.of(MobStyleClass.LLAMA_WHITE_BABY));
        registerVariantBabyStyleClasses(Llama.Color.GRAY, List.of(MobStyleClass.LLAMA_GRAY_BABY));
        registerVariantBabyStyleClasses(Llama.Color.BROWN, List.of(MobStyleClass.LLAMA_BROWN_BABY));
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobIcon.LLAMA_DECOR_NONE;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.LLAMA_DECOR_NONE_BABY;
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
