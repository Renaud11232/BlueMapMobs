package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.VariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pig;

public class PigMarkerBuilder extends VariantMobEntityMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PIG;
    }

    @Override
    public Pig.Variant getVariant(Pig pig) {
        return pig.getVariant();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Pig.Variant> registry) {
        registry.register(Pig.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_PIG);
        registry.register(Pig.Variant.COLD, BlueMapMobsIcon.Mob.COLD_PIG);
        registry.register(Pig.Variant.WARM, BlueMapMobsIcon.Mob.WARM_PIG);
    }
}
