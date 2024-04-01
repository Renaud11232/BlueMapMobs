package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Horse;

import java.util.List;
import java.util.Optional;

public class HorseMarkerBuilder extends MobEntityMarkerBuilder<Horse> {

    public HorseMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Horse horse) {
        return super.buildDefault(horse).map(marker -> {
            Icon icon = switch (horse.getStyle()) {
                case NONE -> Icon.HORSE_MARKINGS_NONE;
                case WHITE -> Icon.HORSE_MARKINGS_WHITE;
                case WHITEFIELD -> Icon.HORSE_MARKINGS_WHITEFIELD;
                case WHITE_DOTS -> Icon.HORSE_MARKINGS_WHITE_DOTS;
                case BLACK_DOTS -> Icon.HORSE_MARKINGS_BLACK_DOTS;
            };
            String horseColorClass = switch (horse.getColor()) {
                case WHITE -> "bluemapmobs-white-horse";
                case CREAMY -> "bluemapmobs-creamy-horse";
                case CHESTNUT -> "bluemapmobs-chestnut-horse";
                case BROWN -> "bluemapmobs-brown-horse";
                case BLACK -> "bluemapmobs-black-horse";
                case GRAY -> "bluemapmobs-gray-horse";
                case DARK_BROWN -> "bluemapmobs-darkbrown-horse";
            };
            marker.addStyleClasses(List.of(horseColorClass));
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.horse", true);
    }
}
