package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MushroomCow;

public class MushroomCowMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.MUSHROOM_COW;
    }

    @Override
    public MushroomCow.Variant getVariant(MushroomCow mushroomCow) {
        return mushroomCow.getVariant();
    }

    @Override
    public void registerVariantIcons(Registry<MushroomCow.Variant, Icon> registry) {
        registry.register(MushroomCow.Variant.RED, BlueMapMobsIcon.Mob.RED_MOOSHROOM);
        registry.register(MushroomCow.Variant.BROWN, BlueMapMobsIcon.Mob.BROWN_MOOSHROOM);
    }
}
