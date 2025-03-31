package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantStyleClassesRegistry;
import org.bukkit.DyeColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sheep;

import java.util.Collection;
import java.util.List;

public class SheepMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<Sheep, DyeColor> {

    public SheepMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SHEEP;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.SHEEP;
    }

    @Override
    public DyeColor getVariant(Sheep sheep) {
        return sheep.getColor();
    }

    //TODO Move constants to dedicated class
    @Override
    public void registerVariantStyleClasses(VariantStyleClassesRegistry<DyeColor> registry) {
        registry.register(DyeColor.WHITE, List.of("bluemapmobs-sheep", "bluemapmobs-white-sheep"));
        registry.register(DyeColor.ORANGE, List.of("bluemapmobs-sheep", "bluemapmobs-orange-sheep"));
        registry.register(DyeColor.MAGENTA, List.of("bluemapmobs-sheep", "bluemapmobs-magenta-sheep"));
        registry.register(DyeColor.LIGHT_BLUE, List.of("bluemapmobs-sheep", "bluemapmobs-lightblue-sheep"));
        registry.register(DyeColor.YELLOW, List.of("bluemapmobs-sheep", "bluemapmobs-yellow-sheep"));
        registry.register(DyeColor.LIME, List.of("bluemapmobs-sheep", "bluemapmobs-lime-sheep"));
        registry.register(DyeColor.PINK, List.of("bluemapmobs-sheep", "bluemapmobs-pink-sheep"));
        registry.register(DyeColor.GRAY, List.of("bluemapmobs-sheep", "bluemapmobs-gray-sheep"));
        registry.register(DyeColor.LIGHT_GRAY, List.of("bluemapmobs-sheep", "bluemapmobs-lightgray-sheep"));
        registry.register(DyeColor.CYAN, List.of("bluemapmobs-sheep", "bluemapmobs-cyan-sheep"));
        registry.register(DyeColor.PURPLE, List.of("bluemapmobs-sheep", "bluemapmobs-purple-sheep"));
        registry.register(DyeColor.BLUE, List.of("bluemapmobs-sheep", "bluemapmobs-blue-sheep"));
        registry.register(DyeColor.BROWN, List.of("bluemapmobs-sheep", "bluemapmobs-brown-sheep"));
        registry.register(DyeColor.GREEN, List.of("bluemapmobs-sheep", "bluemapmobs-green-sheep"));
        registry.register(DyeColor.RED, List.of("bluemapmobs-sheep", "bluemapmobs-red-sheep"));
        registry.register(DyeColor.BLACK, List.of("bluemapmobs-sheep", "bluemapmobs-black-sheep"));
    }

    @Override
    public Collection<String> getDefaultStyleClasses() {
        return List.of("bluemapmobs-sheep", "bluemapmobs-white-sheep");
    }
}
