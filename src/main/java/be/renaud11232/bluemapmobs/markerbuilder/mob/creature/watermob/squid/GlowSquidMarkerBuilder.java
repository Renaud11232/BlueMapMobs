package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;

public class GlowSquidMarkerBuilder extends MobEntityMarkerBuilder<GlowSquid> {
    public GlowSquidMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.GLOW_SQUID, MobIcon.GLOW_SQUID);
    }
}
