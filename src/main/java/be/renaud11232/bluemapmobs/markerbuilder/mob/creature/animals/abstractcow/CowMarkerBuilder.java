package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cow;

public class CowMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.COW;
    }

    @Override
    public Cow.Variant getVariant(Cow cow) {
        return cow.getVariant();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Cow.Variant> registry) {
        registry.register(Cow.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_COW);
        registry.register(Cow.Variant.COLD, BlueMapMobsIcon.Mob.COLD_COW);
        registry.register(Cow.Variant.WARM, BlueMapMobsIcon.Mob.WARM_COW);
    }
}
