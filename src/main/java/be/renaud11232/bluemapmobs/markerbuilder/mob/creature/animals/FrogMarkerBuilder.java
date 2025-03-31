package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.VariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Frog;

public class FrogMarkerBuilder extends VariantMobEntityMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.FROG;
    }

    @Override
    public Frog.Variant getVariant(Frog frog) {
        return frog.getVariant();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Frog.Variant> registry) {
        registry.register(Frog.Variant.COLD, BlueMapMobsIcon.Mob.COLD_FROG);
        registry.register(Frog.Variant.WARM, BlueMapMobsIcon.Mob.TROPICAL_FROG);
        registry.register(Frog.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_FROG);
    }
}
