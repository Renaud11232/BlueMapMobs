package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.VariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import be.renaud11232.bluemapmobs.registry.VariantStyleClassesRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Horse;

import java.util.List;

public class HorseMarkerBuilder extends VariantMobEntityMarkerBuilder<Horse, Horse.Style, Horse.Color> {
    public HorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.HORSE;
    }

    @Override
    public Horse.Style getIconVariant(Horse horse) {
        return horse.getStyle();
    }

    @Override
    public Horse.Color getStyleClassesVariant(Horse horse) {
        return horse.getColor();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Horse.Style> registry) {
        registry.register(Horse.Style.NONE, BlueMapMobsIcon.Mob.HORSE_MARKINGS_NONE);
        registry.register(Horse.Style.WHITE, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITE);
        registry.register(Horse.Style.WHITEFIELD, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITEFIELD);
        registry.register(Horse.Style.WHITE_DOTS, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITE_DOTS);
        registry.register(Horse.Style.BLACK_DOTS, BlueMapMobsIcon.Mob.HORSE_MARKINGS_BLACK_DOTS);
    }

    //TODO Move constants to dedicated class
    @Override
    public void registerVariantStyleClasses(VariantStyleClassesRegistry<Horse.Color> registry) {
        registry.register(Horse.Color.WHITE, List.of("bluemapmobs-horse", "bluemapmobs-white-horse"));
        registry.register(Horse.Color.CREAMY, List.of("bluemapmobs-horse", "bluemapmobs-creamy-horse"));
        registry.register(Horse.Color.CHESTNUT, List.of("bluemapmobs-horse", "bluemapmobs-chestnut-horse"));
        registry.register(Horse.Color.BROWN, List.of("bluemapmobs-horse", "bluemapmobs-brown-horse"));
        registry.register(Horse.Color.BLACK, List.of("bluemapmobs-horse", "bluemapmobs-black-horse"));
        registry.register(Horse.Color.GRAY, List.of("bluemapmobs-horse", "bluemapmobs-gray-horse"));
        registry.register(Horse.Color.DARK_BROWN, List.of("bluemapmobs-horse", "bluemapmobs-darkbrown-horse"));
    }
}
