package be.renaud11232.bluemapmobs.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapmobs.MobsMarkerType;

public interface TraderLlama extends Llama {
    @Override
    default MarkerType getMarkerType() {
        return MobsMarkerType.TRADER_LLAMA;
    }
}
