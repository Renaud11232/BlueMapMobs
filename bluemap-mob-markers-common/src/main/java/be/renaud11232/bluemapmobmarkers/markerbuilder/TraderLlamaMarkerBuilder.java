package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Llama;
import be.renaud11232.bluemapmobmarkers.entity.TraderLlama;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.List;

public class TraderLlamaMarkerBuilder extends AgeableSingleVariantMarkerBuilder<TraderLlama, Llama.Color> {
    public TraderLlamaMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
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
        return MobIcon.TRADER_LLAMA_DECOR;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        return MobIcon.TRADER_LLAMA_DECOR_BABY;
    }

    @Override
    protected Llama.Color getVariant(TraderLlama traderLlama) {
        return traderLlama.getColor();
    }
}
