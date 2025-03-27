package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid.GlowSquidMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;
import org.bukkit.entity.Squid;

public class SquidMarkerBuilder extends MobEntityMarkerBuilder<Squid> {
    public SquidMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.SQUID, BlueMapMobsIcon.Mob.SQUID);
        registerMarkerBuilder(GlowSquid.class, new GlowSquidMarkerBuilder(config));
    }
}
