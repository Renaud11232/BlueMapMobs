package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TraderLlama;

import java.util.List;
import java.util.Optional;

public class TraderLlamaMarkerBuilder extends MobEntityMarkerBuilder<TraderLlama> {

    public TraderLlamaMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(TraderLlama traderLlama) {
        return super.buildDefault(traderLlama).map(marker -> {
            String llamaColorStyle = switch (traderLlama.getColor()) {
                case CREAMY -> "bluemapmobs-creamy-llama";
                case WHITE -> "bluemapmobs-white-llama";
                case GRAY -> "bluemapmobs-gray-llama";
                case BROWN -> "bluemapmobs-brown-llama";
            };
            marker.addStyleClasses(List.of("bluemapmobs-llama", llamaColorStyle));
            marker.setIcon(Icon.TRADER_LLAMA_DECOR.getPath(), Icon.TRADER_LLAMA_DECOR.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.trader_llama", true);
    }
}
