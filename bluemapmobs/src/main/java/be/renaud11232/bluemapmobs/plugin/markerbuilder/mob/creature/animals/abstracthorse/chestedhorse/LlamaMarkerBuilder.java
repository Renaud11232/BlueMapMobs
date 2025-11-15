package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.llama.TraderLlamaMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Llama;
import org.bukkit.entity.TraderLlama;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.List;

public class LlamaMarkerBuilder extends AbstractVariantMobMarkerBuilder<Llama, Material, Llama.Color> {
    public LlamaMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.LLAMA;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Llama> registry) {
        registry.register(TraderLlama.class, new TraderLlamaMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.LLAMA_EMPTY_DECOR;
    }

    @Override
    public Material getIconVariant(Llama llama) {
        ItemStack decor = llama.getInventory().getDecor();
        if (decor == null) {
            return null;
        }
        return decor.getType();
    }

    @Override
    public Llama.Color getStyleClassesVariant(Llama llama) {
        return llama.getColor();
    }

    @Override
    public void registerVariantIcons(Registry<Material, Icon> registry) {
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

    @Override
    public void registerVariantStyleClasses(Registry<Llama.Color, Collection<String>> registry) {
        registry.register(Llama.Color.CREAMY, List.of(BlueMapMobsStyleClass.Mob.CREAMY_LLAMA));
        registry.register(Llama.Color.WHITE, List.of(BlueMapMobsStyleClass.Mob.WHITE_LLAMA));
        registry.register(Llama.Color.GRAY, List.of(BlueMapMobsStyleClass.Mob.GRAY_LLAMA));
        registry.register(Llama.Color.BROWN, List.of(BlueMapMobsStyleClass.Mob.BROWN_LLAMA));
    }
}
