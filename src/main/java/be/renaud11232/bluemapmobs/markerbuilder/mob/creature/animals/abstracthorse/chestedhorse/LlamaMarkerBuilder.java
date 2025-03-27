package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama.TraderLlamaMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
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
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.LLAMA, MobIcon.LLAMA_EMPTY_DECOR, LlamaMarkerBuilder::getCarpet);
        registerMarkerBuilder(TraderLlama.class, new TraderLlamaMarkerBuilder(config));
        registerIcon(Material.WHITE_CARPET, MobIcon.WHITE_LLAMA_DECOR);
        registerIcon(Material.LIGHT_GRAY_CARPET, MobIcon.LIGHTGRAY_LLAMA_DECOR);
        registerIcon(Material.GRAY_CARPET, MobIcon.GRAY_LLAMA_DECOR);
        registerIcon(Material.BLACK_CARPET, MobIcon.BLACK_LLAMA_DECOR);
        registerIcon(Material.BROWN_CARPET, MobIcon.BROWN_LLAMA_DECOR);
        registerIcon(Material.RED_CARPET, MobIcon.RED_LLAMA_DECOR);
        registerIcon(Material.ORANGE_CARPET, MobIcon.ORANGE_LLAMA_DECOR);
        registerIcon(Material.YELLOW_CARPET, MobIcon.YELLOW_LLAMA_DECOR);
        registerIcon(Material.LIME_CARPET, MobIcon.LIME_LLAMA_DECOR);
        registerIcon(Material.GREEN_CARPET, MobIcon.GREEN_LLAMA_DECOR);
        registerIcon(Material.CYAN_CARPET, MobIcon.CYAN_LLAMA_DECOR);
        registerIcon(Material.LIGHT_BLUE_CARPET, MobIcon.LIGHTBLUE_LLAMA_DECOR);
        registerIcon(Material.BLUE_CARPET, MobIcon.BLUE_LLAMA_DECOR);
        registerIcon(Material.PURPLE_CARPET, MobIcon.PURPLE_LLAMA_DECOR);
        registerIcon(Material.MAGENTA_CARPET, MobIcon.MAGENTA_LLAMA_DECOR);
        registerIcon(Material.PINK_CARPET, MobIcon.PINK_LLAMA_DECOR);
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
