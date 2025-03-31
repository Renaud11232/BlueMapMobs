package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.slime.MagmaCubeMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Slime;

public class SlimeMarkerBuilder extends MobEntityMarkerBuilder<Slime> {
    public SlimeMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SLIME;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Slime> registry) {
        registry.register(MagmaCube.class, new MagmaCubeMarkerBuilder(getConfig(), getDefaultConfig()));
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.SLIME;
    }
}
