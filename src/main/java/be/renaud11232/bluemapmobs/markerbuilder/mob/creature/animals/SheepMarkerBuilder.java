package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.DyeColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sheep;

import java.util.List;
import java.util.Optional;

public class SheepMarkerBuilder extends MobEntityMarkerBuilder<Sheep> {

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

    //TODO: Override getStyleClasses
    @Override
    public Optional<POIMarker> build(Sheep sheep) {
        return super.build(sheep).map(marker -> {
            DyeColor color = sheep.getColor();
            String colorClass = "bluemapmobs-white-sheep";
            if (color != null) {
                colorClass = switch (color) {
                    case WHITE -> "bluemapmobs-white-sheep";
                    case ORANGE -> "bluemapmobs-orange-sheep";
                    case MAGENTA -> "bluemapmobs-magenta-sheep";
                    case LIGHT_BLUE -> "bluemapmobs-lightblue-sheep";
                    case YELLOW -> "bluemapmobs-yellow-sheep";
                    case LIME -> "bluemapmobs-lime-sheep";
                    case PINK -> "bluemapmobs-pink-sheep";
                    case GRAY -> "bluemapmobs-gray-sheep";
                    case LIGHT_GRAY -> "bluemapmobs-lightgray-sheep";
                    case CYAN -> "bluemapmobs-cyan-sheep";
                    case PURPLE -> "bluemapmobs-purple-sheep";
                    case BLUE -> "bluemapmobs-blue-sheep";
                    case BROWN -> "bluemapmobs-brown-sheep";
                    case GREEN -> "bluemapmobs-green-sheep";
                    case RED -> "bluemapmobs-red-sheep";
                    case BLACK -> "bluemapmobs-black-sheep";
                };
            }
            marker.addStyleClasses(List.of("bluemapmobs-sheep", colorClass));
            return marker;
        });
    }
}
