package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.VariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creeper;

public class CreeperMarkerBuilder extends VariantMobEntityMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CREEPER;
    }

    @Override
    public Boolean getVariant(Creeper creeper) {
        return creeper.isPowered();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Boolean> registry) {
        registry.register(true, BlueMapMobsIcon.Mob.CHARGED_CREEPER);
        registry.register(false, BlueMapMobsIcon.Mob.CREEPER);
    }
}
