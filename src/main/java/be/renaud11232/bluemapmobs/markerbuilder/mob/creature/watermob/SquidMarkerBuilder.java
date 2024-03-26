package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid.GlowSquidMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;
import org.bukkit.entity.Squid;

import java.util.Optional;

public class SquidMarkerBuilder extends MobEntityMarkerBuilder<Squid> {
    public SquidMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(GlowSquid.class, new GlowSquidMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Squid mob) {
        //TODO
        return super.buildDefault(mob);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.squid", true);
    }
}
