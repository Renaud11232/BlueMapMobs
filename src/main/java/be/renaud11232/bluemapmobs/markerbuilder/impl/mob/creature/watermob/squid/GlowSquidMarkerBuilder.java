package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.watermob.squid;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;

public class GlowSquidMarkerBuilder extends MobEntityMarkerBuilder<GlowSquid> {
    public GlowSquidMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.GLOW_SQUID;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.GLOW_SQUID;
    }
}
