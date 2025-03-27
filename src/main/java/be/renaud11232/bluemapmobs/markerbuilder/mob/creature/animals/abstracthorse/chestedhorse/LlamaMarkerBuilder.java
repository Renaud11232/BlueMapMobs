package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama.TraderLlamaMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
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
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.LLAMA, BlueMapMobsIcon.Mob.LLAMA_EMPTY_DECOR, LlamaMarkerBuilder::getCarpet);
        registerMarkerBuilder(TraderLlama.class, new TraderLlamaMarkerBuilder(config));
        registerIcon(Material.WHITE_CARPET, BlueMapMobsIcon.Mob.WHITE_LLAMA_DECOR);
        registerIcon(Material.LIGHT_GRAY_CARPET, BlueMapMobsIcon.Mob.LIGHTGRAY_LLAMA_DECOR);
        registerIcon(Material.GRAY_CARPET, BlueMapMobsIcon.Mob.GRAY_LLAMA_DECOR);
        registerIcon(Material.BLACK_CARPET, BlueMapMobsIcon.Mob.BLACK_LLAMA_DECOR);
        registerIcon(Material.BROWN_CARPET, BlueMapMobsIcon.Mob.BROWN_LLAMA_DECOR);
        registerIcon(Material.RED_CARPET, BlueMapMobsIcon.Mob.RED_LLAMA_DECOR);
        registerIcon(Material.ORANGE_CARPET, BlueMapMobsIcon.Mob.ORANGE_LLAMA_DECOR);
        registerIcon(Material.YELLOW_CARPET, BlueMapMobsIcon.Mob.YELLOW_LLAMA_DECOR);
        registerIcon(Material.LIME_CARPET, BlueMapMobsIcon.Mob.LIME_LLAMA_DECOR);
        registerIcon(Material.GREEN_CARPET, BlueMapMobsIcon.Mob.GREEN_LLAMA_DECOR);
        registerIcon(Material.CYAN_CARPET, BlueMapMobsIcon.Mob.CYAN_LLAMA_DECOR);
        registerIcon(Material.LIGHT_BLUE_CARPET, BlueMapMobsIcon.Mob.LIGHTBLUE_LLAMA_DECOR);
        registerIcon(Material.BLUE_CARPET, BlueMapMobsIcon.Mob.BLUE_LLAMA_DECOR);
        registerIcon(Material.PURPLE_CARPET, BlueMapMobsIcon.Mob.PURPLE_LLAMA_DECOR);
        registerIcon(Material.MAGENTA_CARPET, BlueMapMobsIcon.Mob.MAGENTA_LLAMA_DECOR);
        registerIcon(Material.PINK_CARPET, BlueMapMobsIcon.Mob.PINK_LLAMA_DECOR);
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
