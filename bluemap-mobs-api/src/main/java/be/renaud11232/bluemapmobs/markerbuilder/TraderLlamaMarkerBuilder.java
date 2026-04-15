package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Llama;
import be.renaud11232.bluemapmobs.entity.TraderLlama;

import java.util.List;

public class TraderLlamaMarkerBuilder extends AgeableSingleVariantMarkerBuilder<TraderLlama, Llama.Color> {
    public TraderLlamaMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultStyleClasses(Llama.Color.CREAMY, List.of(MobsStyleClass.CREAMY_LLAMA));
        registerVariantAdultStyleClasses(Llama.Color.WHITE, List.of(MobsStyleClass.WHITE_LLAMA));
        registerVariantAdultStyleClasses(Llama.Color.GRAY, List.of(MobsStyleClass.GRAY_LLAMA));
        registerVariantAdultStyleClasses(Llama.Color.BROWN, List.of(MobsStyleClass.BROWN_LLAMA));
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        return MobsIcon.TRADER_LLAMA_DECOR;
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        //TODO default baby decor icon
        return super.getDefaultBabyIcon();
    }

    @Override
    protected Llama.Color getVariant(TraderLlama traderLlama) {
        return traderLlama.getColor();
    }
}
