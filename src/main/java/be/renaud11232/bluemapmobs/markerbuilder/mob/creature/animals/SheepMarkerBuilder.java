package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.DyeColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Sheep;

import java.util.List;
import java.util.Optional;

public class SheepMarkerBuilder extends MobEntityMarkerBuilder<Sheep> {

    public SheepMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Sheep sheep) {
        return super.buildDefault(sheep).map(marker -> {
            marker.addStyleClasses(List.of("bluemapmobs-sheep"));
            if(sheep.getName().equals("jeb_")) {
                marker.addStyleClasses(List.of("bluemapmobs-red-sheep", "bluemapmobs-jeb-sheep"));
            } else {
                DyeColor color = sheep.getColor();
                if (color != null) {
                    String colorClass = switch (color) {
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
                    marker.addStyleClasses(List.of(colorClass));
                }
            }
            marker.setIcon(Icon.SHEEP.getPath(), Icon.SHEEP.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.sheep", true);
    }
}
