package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creeper;

public class CreeperMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Creeper, Boolean> {
    public CreeperMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CREEPER;
    }

    @Override
    public Boolean getVariant(Creeper creeper) {
        return creeper.isPowered();
    }

    @Override
    public void registerVariantIcons(Registry<Boolean, Icon> registry) {
        registry.register(true, BlueMapMobsIcon.Mob.CHARGED_CREEPER);
        registry.register(false, BlueMapMobsIcon.Mob.CREEPER);
    }
}
