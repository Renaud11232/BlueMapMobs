package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;

public class GlowSquidMarkerBuilder extends SingleIconMobEntityMarkerBuilder<GlowSquid> {
    public GlowSquidMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.glow_squid", Icon.GLOW_SQUID);
    }
}
