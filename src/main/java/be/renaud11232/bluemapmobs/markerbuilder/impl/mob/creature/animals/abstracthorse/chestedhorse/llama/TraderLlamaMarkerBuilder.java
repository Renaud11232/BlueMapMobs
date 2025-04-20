package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.chestedhorse.llama;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Llama;
import org.bukkit.entity.TraderLlama;

import java.util.Collection;
import java.util.List;

public class TraderLlamaMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<TraderLlama, Llama.Color> {
    public TraderLlamaMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.TRADER_LLAMA;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.TRADER_LLAMA_DECOR;
    }

    @Override
    public Llama.Color getVariant(TraderLlama traderLlama) {
        return traderLlama.getColor();
    }

    @Override
    public void registerVariantStyleClasses(Registry<Llama.Color, Collection<String>> registry) {
        registry.register(Llama.Color.CREAMY, List.of(BlueMapMobsStyleClass.Mob.CREAMY_LLAMA));
        registry.register(Llama.Color.WHITE, List.of(BlueMapMobsStyleClass.Mob.WHITE_LLAMA));
        registry.register(Llama.Color.GRAY, List.of(BlueMapMobsStyleClass.Mob.GRAY_LLAMA));
        registry.register(Llama.Color.BROWN, List.of(BlueMapMobsStyleClass.Mob.BROWN_LLAMA));
    }
}
