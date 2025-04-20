package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Chicken;

public class ChickenMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CHICKEN;
    }

    @Override
    public Chicken.Variant getVariant(Chicken chicken) {
        return chicken.getVariant();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Chicken.Variant> registry) {
        registry.register(Chicken.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_CHICKEN);
        registry.register(Chicken.Variant.COLD, BlueMapMobsIcon.Mob.COLD_CHICKEN);
        registry.register(Chicken.Variant.WARM, BlueMapMobsIcon.Mob.WARM_CHICKEN);
    }
}
