package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;

public class GlowSquidMarkerBuilder extends MobEntityMarkerBuilder<GlowSquid> {
    public GlowSquidMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.GLOW_SQUID, BlueMapMobsIcon.Mob.GLOW_SQUID);
    }
}
