package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Llama;
import be.renaud11232.bluemapmobs.entity.TraderLlama;

import java.util.List;

public class TraderLlamaMarkerBuilder extends AgeableSingleVariantMarkerBuilder<TraderLlama, Llama.Color> {
    public TraderLlamaMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
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
        return MobsIcon.TRADER_LLAMA_DECOR;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobsIcon.TRADER_LLAMA_DECOR_BABY;
    }

    @Override
    protected Llama.Color getVariant(TraderLlama traderLlama) {
        return traderLlama.getColor();
    }
}
