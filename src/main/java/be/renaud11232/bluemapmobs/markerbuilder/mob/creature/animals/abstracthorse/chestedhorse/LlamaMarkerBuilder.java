package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama.TraderLlamaMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Llama;
import org.bukkit.entity.TraderLlama;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public class LlamaMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Llama, Material> {
    public LlamaMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.llama", LlamaMarkerBuilder::getCarpet, Icon.LLAMA_EMPTY_DECOR);
        registerMarkerBuilder(TraderLlama.class, new TraderLlamaMarkerBuilder(config));
        registerIcon(Material.WHITE_CARPET, Icon.WHITE_LLAMA_DECOR);
        registerIcon(Material.LIGHT_GRAY_CARPET, Icon.LIGHTGRAY_LLAMA_DECOR);
        registerIcon(Material.GRAY_CARPET, Icon.GRAY_LLAMA_DECOR);
        registerIcon(Material.BLACK_CARPET, Icon.BLACK_LLAMA_DECOR);
        registerIcon(Material.BROWN_CARPET, Icon.BROWN_LLAMA_DECOR);
        registerIcon(Material.RED_CARPET, Icon.RED_LLAMA_DECOR);
        registerIcon(Material.ORANGE_CARPET, Icon.ORANGE_LLAMA_DECOR);
        registerIcon(Material.YELLOW_CARPET, Icon.YELLOW_LLAMA_DECOR);
        registerIcon(Material.LIME_CARPET, Icon.LIME_LLAMA_DECOR);
        registerIcon(Material.GREEN_CARPET, Icon.GREEN_LLAMA_DECOR);
        registerIcon(Material.CYAN_CARPET, Icon.CYAN_LLAMA_DECOR);
        registerIcon(Material.LIGHT_BLUE_CARPET, Icon.LIGHTBLUE_LLAMA_DECOR);
        registerIcon(Material.BLUE_CARPET, Icon.BLUE_LLAMA_DECOR);
        registerIcon(Material.PURPLE_CARPET, Icon.PURPLE_LLAMA_DECOR);
        registerIcon(Material.MAGENTA_CARPET, Icon.MAGENTA_LLAMA_DECOR);
        registerIcon(Material.PINK_CARPET, Icon.PINK_LLAMA_DECOR);
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
            marker.addStyleClasses(List.of("bluemapmobs-llama", llamaColorStyle));
            return marker;
        });
    }

    private static Material getCarpet(Llama llama) {
        ItemStack decor = llama.getInventory().getDecor();
        if (decor == null) {
            return null;
        }
        return decor.getType();
    }
}
