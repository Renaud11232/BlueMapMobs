package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid.GlowSquidMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;
import org.bukkit.entity.Squid;

public class SquidMarkerBuilder extends MobEntityMarkerBuilder<Squid> {
    public SquidMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SQUID;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Squid> registry) {
        registry.register(GlowSquid.class, new GlowSquidMarkerBuilder(getConfig(), getDefaultConfig()));
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.SQUID;
    }
}
