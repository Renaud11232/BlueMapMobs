package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid.GlowSquidMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;
import org.bukkit.entity.Squid;

public class SquidMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Squid> {
    public SquidMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.squid", Icon.SQUID);
        registerMarkerBuilder(GlowSquid.class, new GlowSquidMarkerBuilder(config));
    }
}
