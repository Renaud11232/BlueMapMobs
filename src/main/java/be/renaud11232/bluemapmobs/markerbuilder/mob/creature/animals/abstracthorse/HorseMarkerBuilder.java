package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Horse;

import java.util.List;
import java.util.Optional;

public class HorseMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Horse, Horse.Style> {
    public HorseMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.HORSE, Horse::getStyle);
        registerIcon(Horse.Style.NONE, MobIcon.HORSE_MARKINGS_NONE);
        registerIcon(Horse.Style.WHITE, MobIcon.HORSE_MARKINGS_WHITE);
        registerIcon(Horse.Style.WHITEFIELD, MobIcon.HORSE_MARKINGS_WHITEFIELD);
        registerIcon(Horse.Style.WHITE_DOTS, MobIcon.HORSE_MARKINGS_WHITE_DOTS);
        registerIcon(Horse.Style.BLACK_DOTS, MobIcon.HORSE_MARKINGS_BLACK_DOTS);
    }

    @Override
    public Optional<POIMarker> buildDefault(Horse horse) {
        return super.buildDefault(horse).map(marker -> {
            String horseColorClass = switch (horse.getColor()) {
                case WHITE -> "bluemapmobs-white-horse";
                case CREAMY -> "bluemapmobs-creamy-horse";
                case CHESTNUT -> "bluemapmobs-chestnut-horse";
                case BROWN -> "bluemapmobs-brown-horse";
                case BLACK -> "bluemapmobs-black-horse";
                case GRAY -> "bluemapmobs-gray-horse";
                case DARK_BROWN -> "bluemapmobs-darkbrown-horse";
            };
            marker.addStyleClasses(List.of("bluemapmobs-horse", horseColorClass));
            return marker;
        });
    }
}
