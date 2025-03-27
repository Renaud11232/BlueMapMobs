package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TraderLlama;

import java.util.List;
import java.util.Optional;

public class TraderLlamaMarkerBuilder extends MobEntityMarkerBuilder<TraderLlama> {
    public TraderLlamaMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.TRADER_LLAMA, MobIcon.TRADER_LLAMA_DECOR);
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
            return marker;
        });
    }
}
