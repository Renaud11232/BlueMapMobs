package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.VariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama.TraderLlamaMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Llama;
import org.bukkit.entity.TraderLlama;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public class LlamaMarkerBuilder extends VariantMobEntityMarkerBuilder<Llama, Material> {
    public LlamaMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    //TODO: Override getStyleClasses
    @Override
    public Optional<POIMarker> build(Llama llama) {
        return super.build(llama).map(marker -> {
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

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.LLAMA;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Llama> registry) {
        registry.register(TraderLlama.class, new TraderLlamaMarkerBuilder(getConfig(), getDefaultConfig()));
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.LLAMA_EMPTY_DECOR;
    }

    @Override
    public Material getVariant(Llama llama) {
        ItemStack decor = llama.getInventory().getDecor();
        if (decor == null) {
            return null;
        }
        return decor.getType();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Material> registry) {
        registry.register(Material.WHITE_CARPET, BlueMapMobsIcon.Mob.WHITE_LLAMA_DECOR);
        registry.register(Material.LIGHT_GRAY_CARPET, BlueMapMobsIcon.Mob.LIGHTGRAY_LLAMA_DECOR);
        registry.register(Material.GRAY_CARPET, BlueMapMobsIcon.Mob.GRAY_LLAMA_DECOR);
        registry.register(Material.BLACK_CARPET, BlueMapMobsIcon.Mob.BLACK_LLAMA_DECOR);
        registry.register(Material.BROWN_CARPET, BlueMapMobsIcon.Mob.BROWN_LLAMA_DECOR);
        registry.register(Material.RED_CARPET, BlueMapMobsIcon.Mob.RED_LLAMA_DECOR);
        registry.register(Material.ORANGE_CARPET, BlueMapMobsIcon.Mob.ORANGE_LLAMA_DECOR);
        registry.register(Material.YELLOW_CARPET, BlueMapMobsIcon.Mob.YELLOW_LLAMA_DECOR);
        registry.register(Material.LIME_CARPET, BlueMapMobsIcon.Mob.LIME_LLAMA_DECOR);
        registry.register(Material.GREEN_CARPET, BlueMapMobsIcon.Mob.GREEN_LLAMA_DECOR);
        registry.register(Material.CYAN_CARPET, BlueMapMobsIcon.Mob.CYAN_LLAMA_DECOR);
        registry.register(Material.LIGHT_BLUE_CARPET, BlueMapMobsIcon.Mob.LIGHTBLUE_LLAMA_DECOR);
        registry.register(Material.BLUE_CARPET, BlueMapMobsIcon.Mob.BLUE_LLAMA_DECOR);
        registry.register(Material.PURPLE_CARPET, BlueMapMobsIcon.Mob.PURPLE_LLAMA_DECOR);
        registry.register(Material.MAGENTA_CARPET, BlueMapMobsIcon.Mob.MAGENTA_LLAMA_DECOR);
        registry.register(Material.PINK_CARPET, BlueMapMobsIcon.Mob.PINK_LLAMA_DECOR);
    }
}
