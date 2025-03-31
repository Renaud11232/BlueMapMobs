package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MushroomCow;

public class MushroomCowMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.MUSHROOM_COW;
    }

    @Override
    public MushroomCow.Variant getVariant(MushroomCow mushroomCow) {
        return mushroomCow.getVariant();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<MushroomCow.Variant> registry) {
        registry.register(MushroomCow.Variant.RED, BlueMapMobsIcon.Mob.RED_MOOSHROOM);
        registry.register(MushroomCow.Variant.BROWN, BlueMapMobsIcon.Mob.BROWN_MOOSHROOM);
    }
}
