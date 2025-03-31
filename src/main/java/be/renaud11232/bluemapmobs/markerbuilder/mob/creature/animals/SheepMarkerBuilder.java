package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
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

    @Override
    public void registerVariantStyleClasses(VariantStyleClassesRegistry<DyeColor> registry) {
        registry.register(DyeColor.WHITE, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.WHITE_SHEEP));
        registry.register(DyeColor.ORANGE, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.ORANGE_SHEEP));
        registry.register(DyeColor.MAGENTA, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.MAGENTA_SHEEP));
        registry.register(DyeColor.LIGHT_BLUE, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.LIGHTBLUE_SHEEP));
        registry.register(DyeColor.YELLOW, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.YELLOW_SHEEP));
        registry.register(DyeColor.LIME, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.LIME_SHEEP));
        registry.register(DyeColor.PINK, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.PINK_SHEEP));
        registry.register(DyeColor.GRAY, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.GRAY_SHEEP));
        registry.register(DyeColor.LIGHT_GRAY, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.LIGHTGRAY_SHEEP));
        registry.register(DyeColor.CYAN, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.CYAN_SHEEP));
        registry.register(DyeColor.PURPLE, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.PURPLE_SHEEP));
        registry.register(DyeColor.BLUE, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.BLUE_SHEEP));
        registry.register(DyeColor.BROWN, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.BROWN_SHEEP));
        registry.register(DyeColor.GREEN, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.GREEN_SHEEP));
        registry.register(DyeColor.RED, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.RED_SHEEP));
        registry.register(DyeColor.BLACK, List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.BLACK_SHEEP));
    }

    @Override
    public Collection<String> getDefaultStyleClasses() {
        return List.of(BlueMapMobsStyleClass.Mob.SHEEP, BlueMapMobsStyleClass.Mob.WHITE_SHEEP);
    }
}
