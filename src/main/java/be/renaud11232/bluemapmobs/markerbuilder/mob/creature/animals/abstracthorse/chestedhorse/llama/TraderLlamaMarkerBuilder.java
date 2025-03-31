package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.TraderLlama;

import java.util.List;
import java.util.Optional;

public class TraderLlamaMarkerBuilder extends MobEntityMarkerBuilder<TraderLlama> {
    public TraderLlamaMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    //TODO: Override getStyleClasses
    @Override
    public Optional<POIMarker> build(TraderLlama traderLlama) {
        return super.build(traderLlama).map(marker -> {
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

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.TRADER_LLAMA;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.TRADER_LLAMA_DECOR;
    }
}
