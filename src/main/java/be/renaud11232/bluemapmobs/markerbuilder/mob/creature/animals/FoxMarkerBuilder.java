package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.VariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Fox;

public class FoxMarkerBuilder extends VariantMobEntityMarkerBuilder<Fox, Fox.Type> {
    public FoxMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.FOX;
    }

    @Override
    public Fox.Type getVariant(Fox fox) {
        return fox.getFoxType();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Fox.Type> registry) {
        registry.register(Fox.Type.RED, BlueMapMobsIcon.Mob.RED_FOX);
        registry.register(Fox.Type.SNOW, BlueMapMobsIcon.Mob.SNOW_FOX);
    }
}
