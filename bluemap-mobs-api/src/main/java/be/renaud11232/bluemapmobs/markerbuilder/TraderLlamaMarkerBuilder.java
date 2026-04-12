package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Llama;
import be.renaud11232.bluemapmobs.entity.TraderLlama;

import java.util.List;

public class TraderLlamaMarkerBuilder extends SimpleSingleVariantMarkerBuilder<TraderLlama, Llama.Color> {
    public TraderLlamaMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Icon getDefaultIcon() {
        return MobsIcon.TRADER_LLAMA_DECOR;
    }

    @Override
    protected Llama.Color getVariant(TraderLlama traderLlama) {
        return traderLlama.getColor();
    }

    @Override
    protected void registerVariantStyleClasses() {
        registerVariantStyleClass(Llama.Color.CREAMY, List.of(MobsStyleClass.CREAMY_LLAMA));
        registerVariantStyleClass(Llama.Color.WHITE, List.of(MobsStyleClass.WHITE_LLAMA));
        registerVariantStyleClass(Llama.Color.GRAY, List.of(MobsStyleClass.GRAY_LLAMA));
        registerVariantStyleClass(Llama.Color.BROWN, List.of(MobsStyleClass.BROWN_LLAMA));
    }
}
