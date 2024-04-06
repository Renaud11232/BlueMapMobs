package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama.TraderLlamaMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Llama;
import org.bukkit.entity.TraderLlama;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public class LlamaMarkerBuilder extends MobEntityMarkerBuilder<Llama> {
    public LlamaMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(TraderLlama.class, new TraderLlamaMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Llama llama) {
        return super.buildDefault(llama).map(marker -> {
            String llamaColorStyle = switch (llama.getColor()) {
                case CREAMY -> "bluemapmobs-creamy-llama";
                case WHITE -> "bluemapmobs-white-llama";
                case GRAY -> "bluemapmobs-gray-llama";
                case BROWN -> "bluemapmobs-brown-llama";
            };
            Icon icon = Icon.LLAMA_EMPTY_DECOR;
            ItemStack decor = llama.getInventory().getDecor();
            if (decor != null) {
                icon = switch (decor.getType()) {
                    case WHITE_CARPET -> Icon.WHITE_LLAMA_DECOR;
                    case LIGHT_GRAY_CARPET -> Icon.LIGHTGRAY_LLAMA_DECOR;
                    case GRAY_CARPET -> Icon.GRAY_LLAMA_DECOR;
                    case BLACK_CARPET -> Icon.BLACK_LLAMA_DECOR;
                    case BROWN_CARPET -> Icon.BROWN_LLAMA_DECOR;
                    case RED_CARPET -> Icon.RED_LLAMA_DECOR;
                    case ORANGE_CARPET -> Icon.ORANGE_LLAMA_DECOR;
                    case YELLOW_CARPET -> Icon.YELLOW_LLAMA_DECOR;
                    case LIME_CARPET -> Icon.LIME_LLAMA_DECOR;
                    case GREEN_CARPET -> Icon.GREEN_LLAMA_DECOR;
                    case CYAN_CARPET -> Icon.CYAN_LLAMA_DECOR;
                    case LIGHT_BLUE_CARPET -> Icon.LIGHTBLUE_LLAMA_DECOR;
                    case BLUE_CARPET -> Icon.BLUE_LLAMA_DECOR;
                    case PURPLE_CARPET -> Icon.PURPLE_LLAMA_DECOR;
                    case MAGENTA_CARPET -> Icon.MAGENTA_LLAMA_DECOR;
                    case PINK_CARPET -> Icon.PINK_LLAMA_DECOR;
                    default -> Icon.LLAMA_EMPTY_DECOR;
                };
            }
            marker.addStyleClasses(List.of("bluemapmobs-llama", llamaColorStyle));
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.llama", true);
    }
}
