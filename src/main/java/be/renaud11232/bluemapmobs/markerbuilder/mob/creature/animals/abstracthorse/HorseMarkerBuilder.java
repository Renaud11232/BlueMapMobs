package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.VariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Horse;

import java.util.List;
import java.util.Optional;

public class HorseMarkerBuilder extends VariantMobEntityMarkerBuilder<Horse, Horse.Style> {
    public HorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    //TODO: Override getStyleClasses
    @Override
    public Optional<POIMarker> build(Horse horse) {
        return super.build(horse).map(marker -> {
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

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.HORSE;
    }

    @Override
    public Horse.Style getVariant(Horse horse) {
        return horse.getStyle();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Horse.Style> registry) {
        registry.register(Horse.Style.NONE, BlueMapMobsIcon.Mob.HORSE_MARKINGS_NONE);
        registry.register(Horse.Style.WHITE, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITE);
        registry.register(Horse.Style.WHITEFIELD, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITEFIELD);
        registry.register(Horse.Style.WHITE_DOTS, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITE_DOTS);
        registry.register(Horse.Style.BLACK_DOTS, BlueMapMobsIcon.Mob.HORSE_MARKINGS_BLACK_DOTS);
    }
}
