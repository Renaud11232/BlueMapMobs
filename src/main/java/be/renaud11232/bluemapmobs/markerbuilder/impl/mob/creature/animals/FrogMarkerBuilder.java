package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Frog;

public class FrogMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.FROG;
    }

    @Override
    public Frog.Variant getVariant(Frog frog) {
        return frog.getVariant();
    }

    @Override
    public void registerVariantIcons(Registry<Frog.Variant, Icon> registry) {
        registry.register(Frog.Variant.COLD, BlueMapMobsIcon.Mob.COLD_FROG);
        registry.register(Frog.Variant.WARM, BlueMapMobsIcon.Mob.TROPICAL_FROG);
        registry.register(Frog.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_FROG);
    }
}
