package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.DyeColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sheep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SheepMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Sheep, DyeColor> {

    public SheepMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
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
    public void registerVariantStyleClasses(Registry<DyeColor, Collection<String>> registry) {
        registry.register(DyeColor.WHITE, List.of(BlueMapMobsStyleClass.Mob.WHITE_SHEEP));
        registry.register(DyeColor.ORANGE, List.of(BlueMapMobsStyleClass.Mob.ORANGE_SHEEP));
        registry.register(DyeColor.MAGENTA, List.of(BlueMapMobsStyleClass.Mob.MAGENTA_SHEEP));
        registry.register(DyeColor.LIGHT_BLUE, List.of(BlueMapMobsStyleClass.Mob.LIGHTBLUE_SHEEP));
        registry.register(DyeColor.YELLOW, List.of(BlueMapMobsStyleClass.Mob.YELLOW_SHEEP));
        registry.register(DyeColor.LIME, List.of(BlueMapMobsStyleClass.Mob.LIME_SHEEP));
        registry.register(DyeColor.PINK, List.of(BlueMapMobsStyleClass.Mob.PINK_SHEEP));
        registry.register(DyeColor.GRAY, List.of(BlueMapMobsStyleClass.Mob.GRAY_SHEEP));
        registry.register(DyeColor.LIGHT_GRAY, List.of(BlueMapMobsStyleClass.Mob.LIGHTGRAY_SHEEP));
        registry.register(DyeColor.CYAN, List.of(BlueMapMobsStyleClass.Mob.CYAN_SHEEP));
        registry.register(DyeColor.PURPLE, List.of(BlueMapMobsStyleClass.Mob.PURPLE_SHEEP));
        registry.register(DyeColor.BLUE, List.of(BlueMapMobsStyleClass.Mob.BLUE_SHEEP));
        registry.register(DyeColor.BROWN, List.of(BlueMapMobsStyleClass.Mob.BROWN_SHEEP));
        registry.register(DyeColor.GREEN, List.of(BlueMapMobsStyleClass.Mob.GREEN_SHEEP));
        registry.register(DyeColor.RED, List.of(BlueMapMobsStyleClass.Mob.RED_SHEEP));
        registry.register(DyeColor.BLACK, List.of(BlueMapMobsStyleClass.Mob.BLACK_SHEEP));
    }

    @Override
    public Collection<String> getDefaultStyleClasses() {
        return List.of(BlueMapMobsStyleClass.Mob.WHITE_SHEEP);
    }

    @Override
    public Collection<String> getStyleClasses(Sheep sheep) {
        Collection<String> styleClasses = super.getStyleClasses(sheep);
        if (sheep.getName().equals("jeb_")) {
            styleClasses = new ArrayList<>(styleClasses);
            styleClasses.add(BlueMapMobsStyleClass.Mob.JEB_SHEEP);
        }
        return styleClasses;
    }
}
