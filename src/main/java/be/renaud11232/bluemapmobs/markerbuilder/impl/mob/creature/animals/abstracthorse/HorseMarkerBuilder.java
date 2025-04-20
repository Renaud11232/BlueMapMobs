package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Horse;

import java.util.Collection;
import java.util.List;

public class HorseMarkerBuilder extends AbstractVariantMobMarkerBuilder<Horse, Horse.Style, Horse.Color> {
    public HorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
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
    public void registerVariantIcons(Registry<Horse.Style, Icon> registry) {
        registry.register(Horse.Style.NONE, BlueMapMobsIcon.Mob.HORSE_MARKINGS_NONE);
        registry.register(Horse.Style.WHITE, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITE);
        registry.register(Horse.Style.WHITEFIELD, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITEFIELD);
        registry.register(Horse.Style.WHITE_DOTS, BlueMapMobsIcon.Mob.HORSE_MARKINGS_WHITE_DOTS);
        registry.register(Horse.Style.BLACK_DOTS, BlueMapMobsIcon.Mob.HORSE_MARKINGS_BLACK_DOTS);
    }

    @Override
    public void registerVariantStyleClasses(Registry<Horse.Color, Collection<String>> registry) {
        registry.register(Horse.Color.WHITE, List.of(BlueMapMobsStyleClass.Mob.WHITE_HORSE));
        registry.register(Horse.Color.CREAMY, List.of(BlueMapMobsStyleClass.Mob.CREAMY_HORSE));
        registry.register(Horse.Color.CHESTNUT, List.of(BlueMapMobsStyleClass.Mob.CHESTNUT_HORSE));
        registry.register(Horse.Color.BROWN, List.of(BlueMapMobsStyleClass.Mob.BROWN_HORSE));
        registry.register(Horse.Color.BLACK, List.of(BlueMapMobsStyleClass.Mob.BLACK_HORSE));
        registry.register(Horse.Color.GRAY, List.of(BlueMapMobsStyleClass.Mob.GRAY_HORSE));
        registry.register(Horse.Color.DARK_BROWN, List.of(BlueMapMobsStyleClass.Mob.DARKBROWN_HORSE));
    }
}
