package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Parrot;

public class ParrotMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PARROT;
    }

    @Override
    public Parrot.Variant getVariant(Parrot parrot) {
        return parrot.getVariant();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Parrot.Variant> registry) {
        registry.register(Parrot.Variant.RED, BlueMapMobsIcon.Mob.RED_PARROT);
        registry.register(Parrot.Variant.BLUE, BlueMapMobsIcon.Mob.BLUE_PARROT);
        registry.register(Parrot.Variant.GREEN, BlueMapMobsIcon.Mob.GREEN_PARROT);
        registry.register(Parrot.Variant.CYAN, BlueMapMobsIcon.Mob.CYAN_PARROT);
        registry.register(Parrot.Variant.GRAY, BlueMapMobsIcon.Mob.GRAY_PARROT);
    }
}
