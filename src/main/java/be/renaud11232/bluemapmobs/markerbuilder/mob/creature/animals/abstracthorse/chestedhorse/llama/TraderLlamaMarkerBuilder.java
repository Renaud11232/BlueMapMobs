package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Llama;
import org.bukkit.entity.TraderLlama;

import java.util.Optional;

public class TraderLlamaMarkerBuilder extends MobEntityMarkerBuilder<TraderLlama> {

    public TraderLlamaMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(TraderLlama traderLlama) {
        //TODO Add merchant carpet variant ?
        return super.buildDefault(traderLlama).map(marker -> {
            Icon icon = switch (traderLlama.getColor()) {
                case GRAY -> Icon.GRAY_LLAMA;
                case BROWN -> Icon.BROWN_LLAMA;
                case CREAMY -> Icon.CREAMY_LLAMA;
                case WHITE -> Icon.WHITE_LLAMA;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.trader_llama", true);
    }
}
